package com.example;

import java.util.Random;

public class Intern extends Employee {

    private int experience;
    private boolean hasLaptop;
    private final Random random = new Random();

    public Intern(String firstName, String lastName, int age, int experience, boolean hasLaptop) {
        super(firstName, lastName, age);
        this.experience = experience;
        this.hasLaptop = hasLaptop;
    }

    @Override
    public void work() {
        System.out.println("INTERN: studying Spring");
    }

    public void askQuestions() {
        String[] phrases = new String[] {"Spring", "Hadoop", "JPA", "Hibernate", "Hive"};
        System.out.println("INTERN: What is " + phrases[random.nextInt(phrases.length)] + "?");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isHasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }
}
