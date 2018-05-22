package net.study.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.Admin;

public class adminTest {
	ClassPathXmlApplicationContext con ;
	@Before
	public void init(){
		 con = new ClassPathXmlApplicationContext("spring-ioc.xml");
	}
	@Test
	public void admin(){
		
//		Admin admin=(Admin) con.getBean("admin");
//		System.out.println(admin);
		con.close();
	}
}
