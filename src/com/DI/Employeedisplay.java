package com.DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employeedisplay {

	public static void main(String[] args) {
		//Using  Constructor we can use Bean Factory
		Resource r = new ClassPathResource("Employee.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Employee e1 = (Employee) f.getBean("emp1");
		System.out.println(e1);
		
}
}