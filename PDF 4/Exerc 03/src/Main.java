public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi() ;
        Zumbi z2 = new Zumbi() ;

        z1.nome = "Zumbi1";
        z2.nome = "Zumbi2";


        z1.vida = 200 ;
        z2.vida = 100 ;

        z1.MostraVida();
        z2.MostraVida() ;

        System.out.println("Igualando as vidas dos zumbis, z1 = z2");

        z1 = z2 ;

        System.out.println("Somando mais 50 pontos em z2 e vendo o que sai ");

        z2.vida = z2.vida + 50 ;

        System.out.println("mostrando a vida de z1 e depois a de z2");

        z1.MostraVida();
        z2.MostraVida();
    }
}