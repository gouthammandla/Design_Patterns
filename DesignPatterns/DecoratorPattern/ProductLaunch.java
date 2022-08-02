package DesignPatterns.DecoratorPattern;

public class ProductLaunch implements Event{
    @Override
    public void startEvent() {
        System.out.println("The Product Launch Meeting has started.");
    }
}
