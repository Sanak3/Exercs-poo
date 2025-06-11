import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int npa , np3 ;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua npa : ");
        npa = entrada.nextInt();

        if(npa < 60){
            System.out.println("Voce ficou de np3");
            System.out.println("Qual a nota da np3 ? ");
            np3 = entrada.nextInt();

            if((np3+npa)/2 >= 50){
                System.out.println("Parabens aprovado !");
            }else {
                System.out.println("Nao passou :( ");
            }

        }else if (npa >= 60) {
            System.out.println("Aprovado !");
        }

        entrada.close();
    }
}