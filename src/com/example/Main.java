package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    // 1
        var emp = new Employee("Anonymous", "Employee", 35) {
            @Override
            public void work() {
                System.out.println("ANONYMOUS_EMPLOYEE: doing something...");
            }

            public void takeABreak() {
                System.out.println("ANONYMOUS_EMPLOYEE: sleeping...");
            }
        };

        emp.takeABreak();

        // 2
        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(new Developer("John", "Doe", 30, 7, true));
        employees.add(new Intern("Meryl", "Streep", 72, 40, true));
        employees.add(new TeamLead("Miranda", "Priestly", 45, 20, true));
        employees.add(new Developer("Grace", "Hopper", 50, 25, true));
        employees.add(new Intern("Ada", "Lovelace", 37, 10, false));

        List<Employee> filteredEmployees = employees
                .stream()
                .filter(e -> e.getAge() > 20 && e.getAge() < 40)
                .collect(Collectors.toList());

        filteredEmployees
                .stream()
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .forEach(System.out::println);
    }
}
