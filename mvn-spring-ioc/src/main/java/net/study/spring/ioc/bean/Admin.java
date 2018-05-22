package net.study.spring.ioc.bean;

import java.util.List;

public class Admin {

	private String adminname;
	private String password;
	private String hehe;
	private List<String> list;
	
	public Admin() {
		super();
		System.out.println("admin初始化中。。。");
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getHehe() {
		return hehe;
	}
	public void setHehe(String hehe) {
		this.hehe = hehe;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminname=" + adminname + ", password=" + password + ", hehe=" + hehe + ", list=" + list + "]";
	}
//	public Admin(String adminname, String password) {
//		super();
//		this.adminname = adminname;
//		this.password = password;
//	}
	
	
	
	
	
}
