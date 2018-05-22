package net.study.spring.ioc.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {

	private String name;
	private String password;
	private List<String> books;
	private Set<String> likes;
	private Map<String,String> haha;
	private Properties pro;
 	
	public User() {
		super();
	}


	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Set<String> getLikes() {
		return likes;
	}
	public void setLikes(Set<String> likes) {
		this.likes = likes;
	}
	public Map<String, String> getHaha() {
		return haha;
	}
	public void setHaha(Map<String, String> haha) {
		this.haha = haha;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", books=" + books + ", likes=" + likes + ", haha="
				+ haha + ", pro=" + pro + "]";
	}
	
	
}
