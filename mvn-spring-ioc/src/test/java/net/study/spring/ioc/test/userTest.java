package net.study.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.User;

public class userTest {

	@Test
	public void testuser(){
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring-ioc.xml");
		User user=(User) con.getBean("user");
		System.out.println(user);
		con.close();
	}
	
	@Test
	public void userBean(){
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring-ioc.xml");
		User user=(User) con.getBean("userBean");
		System.out.println(user);
		con.close();
	}
}
