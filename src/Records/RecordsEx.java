package Records;

record Retangulo(Double largura, Double altura){

}
public class RecordsEx {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(300.0, 100.0);

        System.out.println(r1.altura() + " - " + r1.largura());
    }
}
