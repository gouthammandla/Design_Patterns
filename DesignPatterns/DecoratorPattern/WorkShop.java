package DesignPatterns.DecoratorPattern;

public class WorkShop implements Event{
    @Override
    public void startEvent() {
        System.out.println("The workshop has started.");
    }
}
