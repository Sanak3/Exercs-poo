import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUser, num;

        //gera um numero aleatorio
        Random Rand = new Random();
        num = Rand.nextInt(10) + 1;

        do {
            System.out.println("Qual numero voce chuta ? ");
            numUser = entrada.nextInt();
            if (numUser != num) {
                System.out.print("Numero errado ");
                if(numUser > num){
                    System.out.println("o seu numero é maior que o gerado !");
                }else if (numUser < num){
                    System.out.println("o seu numero é menor que o gerado !");
                }
            } else if (numUser == num) {
                System.out.println("Parabens vc acertou ! ");
            }

        } while (numUser != num);

        entrada.close();
    }
}