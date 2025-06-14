package br.inatel.cdg;

import br.inatel.cdg.Jogador.Nave;
import br.inatel.cdg.inimigo.Asteroide;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("Falcon", 500,"Explosivo");
        Nave nave2 = new Nave("B2H7", 250, "Normal");

        Asteroide asteroide1 = new Asteroide("Galeon", "Grande");
        Asteroide asteroide2 = new Asteroide("Little rock rolling in the universe", "Pequeno");

        nave2.atirar(asteroide1);
        nave1.atirar(asteroide1);
        nave2.atirar(asteroide2);



    }
}