package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call our new method fortunes
        System.out.println(theCoach.getDailyFortune());

        //call new methods
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        context.close();

    }
}
