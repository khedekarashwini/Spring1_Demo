package com.javawing.demofilesystemapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("C:/Users/Datta/Desktop/Bean.xml");
       Customer c1=(Customer) context.getBean("SampleCustomer");
       System.out.println("Customer id= "+c1.getCid());
       System.out.println("Customer name "+c1.getCname());
       
	}

}
