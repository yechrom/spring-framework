package org.springframework.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.demo")
public class Demo {


	public static void main(String[] args) {
		System.out.println(123);
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);

		Object a = context.getBean("a");
		System.out.println(a);
	}
}
