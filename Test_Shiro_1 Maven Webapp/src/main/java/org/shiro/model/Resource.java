package org.shiro.model;


public class Resource {
	private int id;
	private String name;
	private String permission;
	private String url;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", permission="
				+ permission + ", url=" + url + "]";
	}
}
