package com.su.spring;

import com.su.spring.bean.Man;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
testMethod();
    }
    public static void testMethod(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Man xh= ctx.getBean("xh",Man.class);
        System.out.println(xh);
        System.out.println(ReflectionToStringBuilder.toString(xh));
    }
}
