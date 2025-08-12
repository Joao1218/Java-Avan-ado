package MethodReferences;

@FunctionalInterface
interface Figura2D{
    void desenha(Double largura, Double altura);
}
class retangulo{
    public void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retangulo de largura: "+largura+" e altura: "+altura);
    };
}
public class MethodObejtoParticular {
    public static void main(String[] args){
        //Usando lambda pra fazer
        Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de largura: "+l+" e altura: "+a);
        fig1.desenha(10.0, 5.0);

        //Usando Method references

        //Objeto especificado
        retangulo ret = new retangulo();
        //Passamos uma referencia pra ele seguir e imprimir os objetos
        Figura2D fig2 = ret::desenhaRetangulo;
        fig2.desenha(2.0,5.0);
    }
}
