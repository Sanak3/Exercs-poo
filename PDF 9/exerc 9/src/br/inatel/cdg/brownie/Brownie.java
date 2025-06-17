package br.inatel.cdg.brownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras (){
        System.out.println("Adicionando ao carrinho de compras " + this.nome);
    }

    public void calculaValorTotal (){
        System.out.println("Total da sua compra = "+this.preco);
    }

    public void mostraInfo (){
        System.out.println("Brownies : ");
        System.out.println("Nome = "+this.nome);
        System.out.println("Sabor = "+this.sabor);
        System.out.println("Preco = "+this.preco);
        System.out.println(" ");
    }

}

