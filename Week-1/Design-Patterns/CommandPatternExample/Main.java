// package Week-1.Design-Patterns.CommandPatternExample;

public class Main {

    public static void main(String[] args) {

        // Receiver
        Light light = new Light();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn OFF
        remote.setCommand(lightOff);
        remote.pressButton();

    }
}
