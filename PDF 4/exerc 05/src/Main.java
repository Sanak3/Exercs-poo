public class Main {
    public static void main(String[] args) {

        Personagem persona1 = new Personagem() ;
        Personagem persona2 = new Personagem();

        persona1.pontos = 100 ;
        persona2.pontos = 250 ;

        persona1.nome = "Igor";
        persona2.nome = "Igor mutante";

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        persona1.arma = arma1;
        persona2.arma = arma2;

        arma1.nome = "Glock .40";
        arma1.poder = 30 ;
        arma1.resistencia = 40 ;
        arma1.descricao = "Arma portatil, com bom dano, mas nao dura muito";

        arma2.nome = "Machado eletrico";
        arma2.poder = 60 ;
        arma2.resistencia = 100;
        arma2.descricao = "Arma robusta, dano absurdo e muito duravel" ;

        System.out.println("Vida de personagem 1 = "+persona1.pontos);
        System.out.println("vida de personagem 2 = "+persona2.pontos);

        persona1.tomarDano();
        persona1.usarArma();

        persona1.arma.mostraInfoArma();
        persona2.arma.mostraInfoArma();
    }
}