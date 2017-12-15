package dk.kea.examples.Mediator;

public class MediatorPatternDemo
{
    public void run()
    {
        User asger = new User("Asger");
        User jon = new User("Jon");

        // notice that even though Asger sends a massage directed for Jon,
        // the code doesn't specify  it, because its the chatroom that receives it
        // a mediator.
        asger.sendMessage("Hi! Jon!");
        jon.sendMessage("Hello! Asger!");
    }
}