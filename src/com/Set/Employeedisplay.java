package com.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeedisplay {

	public static void main(String[] args) {
		// Using setter we can use Application Context or Bean Factory
		ApplicationContext c = new ClassPathXmlApplicationContext("Employee1.xml");
		Employee e1 = (Employee) c.getBean("emp1");
		System.out.println(e1);
//		Resource r= new ClassPathResource("Employee1.xml");
//		BeanFactory f = new XmlBeanFactory(r);
//		Employee e1 = (Employee) f.getBean("emp1");
//		System.out.println(e1);
	}

}
