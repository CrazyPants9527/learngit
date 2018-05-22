package net.study.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.Product;
import net.study.spring.ioc.bean.User;

public class ProductTest {
//	private ClassPathXmlApplicationContext con;
//	@Before
//	private void init() {
//		// TODO Auto-generated method stub
//		 con=new ClassPathXmlApplicationContext("spring-ioc.xml");
//	}
	@Test
	public void teatcreatproduct(){
		ClassPathXmlApplicationContext con= new ClassPathXmlApplicationContext("spring-ioc.xml");
		Product product=(Product) con.getBean("creatProduct");
		System.out.println(product);
		con.close();
	}
	
}
