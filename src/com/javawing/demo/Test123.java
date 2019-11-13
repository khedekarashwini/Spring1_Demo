package com.javawing.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test123 {

	public static void main(String[] args) {
		
ApplicationContext container=new ClassPathXmlApplicationContext("Beans.xml");
   Student123 s1=(Student123) container.getBean("Sampleteach");
   System.out.println("Student Id: "+s1.getId());
   System.out.println("Student Name: "+s1.getName());
   
   Teacher123 t1=(Teacher123) container.getBean("Sampleteach1");
    System.out.println("Teacher name "+t1.getName());
   System.out.println("Teacher id: "+t1.getId());
	}

}
