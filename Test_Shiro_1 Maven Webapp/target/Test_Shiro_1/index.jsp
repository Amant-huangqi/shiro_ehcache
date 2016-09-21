<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		hello
		<shiro:principal></shiro:principal>
	</h1>
	<!-- 不登陆时显示 -->
	<shiro:guest>
		<a href="/shiro-first/login">用户登录</a>
	</shiro:guest>
	<shiro:user>
		<a href="/shiro-first/user/list.jsp">用户列表</a>
		<!-- 有user:add权限的显示 -->
		<shiro:hasPermission name="user:add">
			<a href="/shiro-first/user/add.jsp">用户添加</a>
		</shiro:hasPermission>
		<!-- 有角色权限的显示 -->
		<shiro:hasRole name="admin">
			<a href="/shiro-first/admin">管理界面</a>
		</shiro:hasRole>
		<a href="/shiro-first/logout">退出系统</a>
	</shiro:user>
</body>
</html>