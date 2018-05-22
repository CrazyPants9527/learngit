package net.study.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.Hello;

public class helloTest {
	@Test
	public void sayhello() {
		ApplicationContext con = new ClassPathXmlApplicationContext("spring-ioc.xml");
		Hello he = (Hello) con.getBean("hello");
		System.out.println(he.sayHello());
	}
}
