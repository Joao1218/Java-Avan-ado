package MethodReferences;

import java.util.ArrayList;
import java.util.List;

class Produto2{
    private String nome;
    private Double preco;

    public Produto2(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void imprime(){
        System.out.println("Nome: "+nome+", preço: "+preco);
    }
}
public class MethodEstanciaArbitraria {
    public static void main(String[] args) {
        List<Produto2> listaProd = new ArrayList<>();

        listaProd.add(new Produto2("TV", 1.000));
        listaProd.add(new Produto2("Celular", 3.000));
        listaProd.add(new Produto2("Tablet", 2.500));
        listaProd.add(new Produto2("Cpmputador", 8.200));
        listaProd.add(new Produto2("Monitor", 1.100));

        //Imprimindo os produtos a partir de method references só que atraves de um metodo da propria classe produto
        listaProd.forEach(Produto2::imprime);
    }
}