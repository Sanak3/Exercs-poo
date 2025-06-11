public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 500;
        zumbi2.vida = 300;

        zumbi1.nome = "Igor" ;
        zumbi2.nome = "Algum nome" ;

        zumbi1.MostraVida();
        zumbi2.MostraVida();

        zumbi1.trasfereVida(zumbi2 , 50);

        zumbi2.MostraVida();


    }
}