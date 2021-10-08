package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add new field
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter method setEmailAddress()");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside setter method setTeam()");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }


    //create no arg constructor
    public CricketCoach(){
        System.out.println("CricketCoach: Inside no args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter method setFortuneService()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
