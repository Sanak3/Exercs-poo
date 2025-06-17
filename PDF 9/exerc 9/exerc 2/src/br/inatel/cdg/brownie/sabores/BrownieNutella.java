package br.inatel.cdg.brownie.sabores;

import br.inatel.cdg.brownie.Brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, String sabor , double preco) {
        super (nome, preco , sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando mais Nutella ao seu brownie ! ");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando BW de Nutella ao carrinho");
    }
}