package DesignPatterns.DecoratorPattern;

public class NewEventDecorator extends EventDecorator{
    public NewEventDecorator(Event decoratedEvent) {
        super(decoratedEvent);
    }

    @Override
    public void startEvent() {
        decoratedEvent.startEvent();
        provideNotes(decoratedEvent);
    }

    private void provideNotes(Event decoratedEvent) {
        System.out.println("Notepad and Pen are provided.");
    }
}
