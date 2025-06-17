package br.inatel.cdg.bloco;

public class Bloco {
    private static int numBlocos = 0 ;

    public Bloco (){
        numBlocos++;
    }

    public void destruir (){
        System.out.println("Bloco indo de ralo ");
        numBlocos--;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }

    public static void setNumBlocos(int numBlocos) {
        Bloco.numBlocos = numBlocos;
    }
}
