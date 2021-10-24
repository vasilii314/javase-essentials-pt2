package com.example;

public class TeamLead extends Employee implements Manager {

    private int experience;
    private boolean hasLaptop;

    public TeamLead(String firstName, String lastName, int age, int experience, boolean hasLaptop) {
        super(firstName, lastName, age);
        this.experience = experience;
        this.hasLaptop = hasLaptop;
    }

    public void giveTasks() {
        System.out.println("TEAMLEAD: I have a task for you");
    }

    @Override
    public void work() {
        System.out.println("TEAMLEAD: currently on meeting with client");
    }

    @Override
    public void manage() {
        System.out.println("Managing tasks with jira");
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
