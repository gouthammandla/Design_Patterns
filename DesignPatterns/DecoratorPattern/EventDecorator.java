package DesignPatterns.DecoratorPattern;

public class EventDecorator implements Event{
    protected Event decoratedEvent;

    public EventDecorator(Event decoratedEvent) {
        this.decoratedEvent=decoratedEvent;
    }

    public void startEvent() {
        decoratedEvent.startEvent();
    }
}
