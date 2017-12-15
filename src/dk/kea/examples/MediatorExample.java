package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Mediator.MediatorPatternDemo;

public class MediatorExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show the mediator pattern in action";
    }

    @Override
    public String getName()
    {
        return "Mediator pattern";
    }

    @Override
    public void runExample()
    {
        MediatorPatternDemo mediatorPatternDemo = new MediatorPatternDemo();

        mediatorPatternDemo.run();
    }
}
