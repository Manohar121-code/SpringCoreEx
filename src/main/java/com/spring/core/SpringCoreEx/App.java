package com.spring.core.SpringCoreEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Employee bean = (Employee) context.getBean("employeeId1");
        System.out.println(bean);
        
        Employee bean2 = (Employee) context.getBean("employeeId1");
        System.out.println(bean2);
        
        System.out.println(bean == bean2);
        
        System.out.println("------------------------");
        
        Employee bean3 = (Employee) context.getBean("employeeId2");
        System.out.println(bean3);
        
        Employee bean4 = (Employee) context.getBean("employeeId2");
        System.out.println(bean4);
        
        System.out.println(bean3 == bean4);
        
        System.out.println("------------------------");
        
        Employee bean5 = (Employee) context.getBean("employeeId3");
        System.out.println(bean5);
    }
}
