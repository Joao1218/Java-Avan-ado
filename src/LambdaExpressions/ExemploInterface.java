package LambdaExpressions;

//Usando a minha propria interface sem a direto do java
interface figura {
    void desenha();
}

public class ExemploInterface {
    public static void main(String[] args){

        //Fazendo sem o lambda Expression
        figura fig1 = new figura() {
            @Override
            public void desenha() {
                System.out.println("Desenhando");
            }
        };

        fig1.desenha();

        //Agora fazendo com o lambda expression
        //Retirando a redundancia do codigo e tanta verbosidade
        figura fig2 = () -> System.out.println("Desenhando2");
        fig2.desenha();
    }
}
