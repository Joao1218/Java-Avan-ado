package MethodReferences;

@FunctionalInterface
interface Figura2D2{
    retangulo2 desenha(Double largura, Double altura);
}
class retangulo2{
    public retangulo2(Double largura, Double altura){
        System.out.println("Desenha retangulo de largura: "+largura+" e altura: "+altura);
    };
}
public class MethodConstrutor {
    public static void main(String[] args){
        Figura2D2 fig1 = retangulo2::new;
        fig1.desenha(10.0,2.5);
    }
}
