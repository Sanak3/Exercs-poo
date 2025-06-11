public class Personagem {
    String nome ;
    int pontos ;
    Arma arma ;


    void usarArma (){
        System.out.println("Disparando!");
        arma.resistencia -= 2 ;
    }

    void tomarDano (){
        System.out.println("Voce foi atingido e perdeu 5 pontos de vida");
        pontos -= 5 ;
        System.out.println("Sua vida atual : "+this.pontos);
    }

}
