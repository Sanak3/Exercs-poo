package br.inatel.cdg.brownie.sabores;

import br.inatel.cdg.brownie.Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, String sabor, double preco) {
        super (nome, preco, sabor);
    }

    public void adicionaCafe (){
        System.out.println("Adicionando mais cafe ao brownie");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando BW de cafe ao carrinho");
    }
}
