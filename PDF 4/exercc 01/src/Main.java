public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi() ;
        zumbi.vida = 200;
        zumbi.velocidade = 0;

        zumbi.ZumbiAtacado();
        zumbi.Correr();
        zumbi.Andar();
        zumbi.MostraVida();
        zumbi.ZumbiRegenerar();


    }
}