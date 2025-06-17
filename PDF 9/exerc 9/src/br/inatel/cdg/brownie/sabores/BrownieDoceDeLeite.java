package br.inatel.cdg.brownie.sabores;

import br.inatel.cdg.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, String sabor , double preco ) {
        super(nome,preco,sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando mais Doce de Leite");
    }
}
