package com.dubbo.consumer;

import com.dubbo.provider.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Person person = (Person) context.getBean("personApi");

        String hi = person.syaHi("dubbo");
        System.out.println(hi);
        String work = person.working("java");
        System.out.println(work);

    }
}
