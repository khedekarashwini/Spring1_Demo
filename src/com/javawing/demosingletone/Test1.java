package com.javawing.demosingletone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans2.xml");
		Animal a=(Animal) context.getBean("Sampleanimal");
		
		a.setName("Xyz");
		
		a.setColour("pink");
		
		
		Animal a1=(Animal) context.getBean("Sampleanimal");
		
		a1.setName("pqr");
		a1.setColour("Yellow");
		System.out.println("Animal name="+a.getName());
		System.out.println("Animal colour= "+a.getColour());


		System.out.println("Animal name="+a1.getName());

		System.out.println("Animal colour= "+a1.getColour());
	}

}
