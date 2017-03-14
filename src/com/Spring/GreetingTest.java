package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		 
		/*
				BeanFactory factory = new XmlBeanFactory(new FileSystemResource("greeting.xml"));
				GreetingService gs1 = (GreetingService) factory.getBean("gs1");
				gs1.sayGreeting();
				GreetingService gs2 = (GreetingService) factory.getBean("gs2");
				gs2.sayGreeting();
			*/
				
				ApplicationContext context= new ClassPathXmlApplicationContext("greeting.xml");
		        GreetingService gs1= (GreetingService) context.getBean("gs1");
		        gs1.sayGreeting();
		       GreetingService gs2= (GreetingService) context.getBean("gs2");
		        gs2.sayGreeting();

	}

}
