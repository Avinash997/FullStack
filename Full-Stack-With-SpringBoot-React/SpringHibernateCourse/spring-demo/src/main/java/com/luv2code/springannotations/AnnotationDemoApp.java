package com.luv2code.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
//        TennisCoach theCoach = context.getBean("thatSillyCoach", TennisCoach.class);
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //lets call our new method fortunes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
