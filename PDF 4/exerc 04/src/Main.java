public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2= new Zumbi() ;

        z1.vida = 200 ;
        z2.vida = 400 ;

        z1.nome = "Z1" ;
        z2.nome = "Z2" ;

        z1.MostraVida();
        z2.MostraVida();

        System.out.println("Comecando as transferencias de vida ");
        if (z1.trasfereVida(z2 , 30 )){
            System.out.println("Transferindo 30 pts pontos para z2");
            System.out.println("Vida do zumbi = "+z1.vida);
            System.out.println("Vida do zumbi = "+z2.vida);


            if (z2.trasfereVida(z1 , 100)){
            System.out.println("Transferindo 100 pontos para z2  ");
            System.out.println("Vida do zumbi = "+z1.vida);
            System.out.println("Vida do zumbi = "+z2.vida);
            }

        }else {
            System.out.println("Transferencia invalida");
        }

    }
}