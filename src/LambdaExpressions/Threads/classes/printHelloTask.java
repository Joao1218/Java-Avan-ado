package LambdaExpressions.Threads.classes;

//Mexendo com threads e a classe runnable
public class printHelloTask implements Runnable{
    private String nome;

    public printHelloTask(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("Hello "+nome);
    }
}
