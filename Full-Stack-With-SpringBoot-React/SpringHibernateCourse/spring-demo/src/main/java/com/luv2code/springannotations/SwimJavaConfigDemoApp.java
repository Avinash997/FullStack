package com.luv2code.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // load the spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container
//        TennisCoach theCoach = context.getBean("thatSillyCoach", TennisCoach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //lets call our new method fortunes
        System.out.println(theCoach.getDailyFortune());

        //call new methods
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // close the context
        context.close();

    }
}
