package dk.kea.examples.Mediator;

public class User
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public User(String name)
    {
        this.name  = name;
    }

    // takes a massage from a user and shows it in the chatroom.
    public void sendMessage(String message)
    {
        ChatRoom.showMessage(this, message);
    }
}