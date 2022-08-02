package DesignPatterns.TemplatePattern;

public class Employee1 extends EmployeeMeetings {
    @Override
    void morningMeet() {
       System.out.println("Join Google meet at : 9AM");
    }

    @Override
    void afternoonMeet() {
       System.out.println("Join Project Call at :2PM");
    }

    @Override
    void eveningMeet() {
       System.out.println("Join Team Meet at :6PM");
    }
}
