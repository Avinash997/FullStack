package com.luv2code.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // load the spring config file
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container
//        TennisCoach theCoach = context.getBean("thatSillyCoach", TennisCoach.class);
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //lets call our new method fortunes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
