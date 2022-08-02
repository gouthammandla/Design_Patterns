package DesignPatterns.TemplatePattern;

public abstract class EmployeeMeetings {
    abstract void morningMeet();
    abstract void afternoonMeet();
    abstract void eveningMeet();

    //template method
    public final void joinMeetings() {
        morningMeet();
        afternoonMeet();
        eveningMeet();
    }
}
