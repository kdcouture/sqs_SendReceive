/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sqs_Send;

public class App {
    public String getGreeting() {
        return "Starting Sender...";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        sqs_Sender.send(args[0]);
        System.out.println("Sent");
    }
}
