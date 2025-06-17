package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;

public class Jogador {
    private int ponto ;

    public void destruirBlocos(Bloco bloco){
        bloco.destruir();
        ponto++;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}
