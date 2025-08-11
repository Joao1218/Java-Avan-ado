package LambdaExpressions.Threads;

public class ExemploThread {
    public static void main(String[] args){
        //Declarando o metodo runnble sem a lambda expression
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Word");
            }
        });
        t1.start();


        //Agora usando Lambda Expression
        //Como não tem parametro colocamos o parenteses vazio
        Thread t2 = new Thread( () -> System.out.println("Hello Word2"));

        t2.start();

    }
}
