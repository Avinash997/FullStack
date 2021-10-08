package com.luv2code.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        TennisCoach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);

        //check if they are the same beans
        boolean result = (theCoach == alphaCoach);

        // call methods on the bean
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
