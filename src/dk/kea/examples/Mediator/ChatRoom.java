package dk.kea.examples.Mediator;

import java.util.Date;

// Our Mediator Pattern
// It gets a message from a user and shows it to all
// instead of a user sends a message to another user directly.
public class ChatRoom
{
    public static void showMessage(User user, String message)
    {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}