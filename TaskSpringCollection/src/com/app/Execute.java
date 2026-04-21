package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.JavaQue;

public class Execute {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		JavaQue jq =  (JavaQue) context.getBean("qID");
		
		jq.display();
	}

}
