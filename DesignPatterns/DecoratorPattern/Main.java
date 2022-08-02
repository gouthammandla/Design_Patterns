package DesignPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {

        Event event = new WorkShop();

        Event event1 = new EventDecorator(event);
        event1.startEvent();

        System.out.println();

        Event event2 = new NewEventDecorator(event);
        event2.startEvent();

    }
}
