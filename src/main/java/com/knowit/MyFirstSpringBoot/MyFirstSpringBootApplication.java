package com.knowit.MyFirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(MyFirstSpringBootApplication.class, args);
		Test obj = ctx.getBean(Test.class);
		System.out.println(obj);
		
		String [] beansName = ctx.getBeanDefinitionNames();
		
		for(String beans : beansName) {
			System.out.println(beans);
		}
	}

}
