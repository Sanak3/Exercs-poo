package br.inatel.cdg.Jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private  String nome ;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar (Asteroide ast){
        if (tipoTiro == "Explosivo"){
            ast.destruir();
        }else if(ast.getTipoAsteroide()=="Grande"){
            System.out.println("Sua nave não tem poder de fogo para destruir este asteroide");
        }else {
            ast.destruir();
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }
}
