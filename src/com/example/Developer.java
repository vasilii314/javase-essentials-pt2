package com.example;

public class Developer extends Employee {

    private int experience;
    private boolean hasLaptop;

    public Developer(String firstName, String lastName, int age, int experience, boolean hasLaptop) {
        super(firstName, lastName, age);
        this.experience = experience;
        this.hasLaptop = hasLaptop;
    }

    public void lunch() {
        System.out.println("DEVELOPER: Don't bother me, I'm having lunch");
    }

    @Override
    public void work() {
        System.out.println("DEVELOPER: currently working with Hadoop");
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
