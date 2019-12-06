package com.pradeep.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        
        
          Vechile vech=(Vechile) context.getBean("vechile");
          vech.drive();
        		  
    }
}
