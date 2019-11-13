package com.javawing.demoprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans3.xml");
		Book b=(Book) context.getBean("Samplebook");
		b.setBook_code(101);
		System.out.println(b.getBook_code());
		b.setBname("Panipath");
		
		System.out.println(b.getBname());
		
		Book b1=(Book) context.getBean("Samplebook");
		b1.setBook_code(102);
		b1.getBook_code();
		b1.setBname("Chava");
		System.out.println(b.getBook_code());

	}

}
