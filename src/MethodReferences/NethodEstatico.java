package MethodReferences;

import java.util.ArrayList;
import java.util.List;

//Classe de exemplo pra trabalharmos com lista
class Produto{
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
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
}
class impressora {
    public static void imprime(Produto p){
        System.out.println("Nome: "+p.getNome()+", preço: "+p.getPreco());
    }
}
public class NethodEstatico {
    public static void main(String[] args){
        List<Produto> listaProd = new ArrayList<>();

        listaProd.add(new Produto("TV",1.000));
        listaProd.add(new Produto("Celular",3.000));
        listaProd.add(new Produto("Tablet",2.500));
        listaProd.add(new Produto("Cpmputador",8.200));
        listaProd.add(new Produto("Monitor",1.100));

        //Imprimindo os produtos a partir de method references, utilizando chamada via metodo estatico
        listaProd.forEach(impressora::imprime);


    }
}
