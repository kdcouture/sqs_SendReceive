/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sqs_Receive;

public class App {
    public String getGreeting() {
        return "Starting Receiver...";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        sqs_Receiver.receive(args[0]);
    }
}
