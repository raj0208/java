package com.myspring;

import com.springinaction.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;


public class MainApp {

	
	public static void main(String[] args) {
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		*/
		/*if (context.containsBean("simpleBean")) {
			System.out.println("SimpleBean exists");
		}
		if (context.containsBean("beanWithLazyInit")) {
			System.out.println("beanWithLazyInit exists");
		}
		if (context.containsBean("beanWithInitMethod")) {
			System.out.println("beanWithInitMethod exists");
		}
				
		HelloWorld lazyBean = (HelloWorld) context.getBean("beanWithLazyInit");
		lazyBean.getMessage();
		HelloWorld initBean = (HelloWorld) context.getBean("beanWithInitMethod");
		initBean.getMessage();
		*/
		
		/*		
		HelloWorld simpleBean = (HelloWorld) context.getBean("simpleBean");
		simpleBean.setMessage("Simple Bean");
		simpleBean.getMessage();
		
		HelloWorld defSimpleBean = (HelloWorld) context.getBean("defSimpleBean");
		defSimpleBean.setMessage("Def Simple Bean");
		defSimpleBean.getMessage();
		
		context.registerShutdownHook();*/
		/* Override sample */
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();*/
		
		/*Annotation Samples*/
		//AnnotationSamples();
		
		SpringInActionAutoConfig();
	}
	
	private static void AnnotationSamples()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotations.xml");
		AnnotationSamples sample = (AnnotationSamples) context.getBean("textEditor");
		sample.spellCheck();
	}

	private static void SpringInActionAutoConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CDPlayer cd = context.getBean(CDPlayer.class);
		cd.play();
	}

}