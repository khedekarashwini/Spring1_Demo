package com.javawing.demofactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test123 
{

	public static void main(String[] args) {
		BeanFactory container1=new ClassPathXmlApplicationContext("Beans1.xml");
		Employee123 e=(Employee123) container1.getBean("Sampleemp");
		System.out.println("Employee Id="+e.getId());
		System.out.println("Emplyee name"+e.getName());

	}

}
