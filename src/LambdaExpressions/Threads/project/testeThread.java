package LambdaExpressions.Threads.project;

import LambdaExpressions.Threads.classes.printHelloTask;

//Thread é usado para executarmos coisas ao mesmo tempo
public class testeThread {
    public static void main(String[] args) {
        Thread task1 = new Thread(new printHelloTask("Task 1"));
        Thread task2 = new Thread(new printHelloTask("Task 2"));
        Thread task3 = new Thread(new printHelloTask("Task 3"));
        Thread task4 = new Thread(new printHelloTask("Task 4"));

        task1.start();
        task2.start();
        task3.start();
        task4.start();

    }
}
