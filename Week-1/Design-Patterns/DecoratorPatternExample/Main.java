// package Week-1.Design-Patterns.DecoratorPatternExample;

public class Main {

    public static void main(String[] args) {

        System.out.println("Email Notification:");
        Notifier email = new EmailNotifier();
        email.send("Hello!");

        System.out.println();

        System.out.println("Email + SMS Notification:");
        Notifier emailSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailSMS.send("Hello!");

        System.out.println();

        System.out.println("Email + SMS + Slack Notification:");
        Notifier all = new SlackNotifierDecorator(
                            new SMSNotifierDecorator(
                                new EmailNotifier()));

        all.send("Hello!");

    }

}
