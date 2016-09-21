package org.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;

/**
 * ��UserRealm������˷���URL
 * �����ڴ˴�ʹ��URL������֤
 * @author Administrator
 *
 */
public class ResourceCheckFilter extends AccessControlFilter {
	
	private String errorUrl;
	
	public String getErrorUrl() {
		return errorUrl;
	}

	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
	}

	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		Subject subject = getSubject(request, response);
		String url = getPathWithinApplication(request);//�õ����ʵ�URL
		return subject.isPermitted(url);//����URL��֤   ʹ��Resovler (��ini������)
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		HttpServletResponse hsp = (HttpServletResponse)response;
		HttpServletRequest hReq = (HttpServletRequest)request;
		hsp.sendRedirect(hReq.getContextPath()+"/"+this.errorUrl);//��ini��resourceCheckFilter.errorUrl = /unauth.jsp
		return false;
	}

}
