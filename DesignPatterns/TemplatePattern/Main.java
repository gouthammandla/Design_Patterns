package DesignPatterns.TemplatePattern;

public class Main {
    public static void main(String[] args) {

        EmployeeMeetings meetings = new Employee1();
        meetings.joinMeetings();

        System.out.println();

        meetings = new Employee2();
        meetings.joinMeetings();
    }
}
