package com.luv2code.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
//@Scope("prototype")
@Component
public class TennisCoach implements Coach {

    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    //add new field
//    private String emailAddress;
//    private String team;
//
//    public void setEmailAddress(String emailAddress) {
//        System.out.println("CricketCoach: Inside setter method setEmailAddress()");
//        this.emailAddress = emailAddress;
//    }
//
//    public void setTeam(String team) {
//        System.out.println("CricketCoach: Inside setter method setTeam()");
//        this.team = team;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public String getTeam() {
//        return team;
//    }
//
//
    //create constructor
    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
     */

    public TennisCoach(){
        System.out.println(">> TennisCoach: Inside default constructor");
    }

    //init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: Inside doMyStartupStuff");
    }

    //destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: Inside doMyCleanupStuff");
    }

//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: Inside setter method setFortuneService()");
//        fortuneService = theFortuneService;
//    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: Inside setter method doSomeCrazyStuff()");
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
