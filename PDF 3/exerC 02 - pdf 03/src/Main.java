import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        int lanche01 , lanche02 , lanche03 , total , media ;
        System.out.println("Quantos lanches foram consumidos na primeira hora : ");
        lanche01 = entrada.nextInt();

        System.out.println("Quantos lanches foram consumidos na segunda hora : ");
        lanche02 = entrada.nextInt();

        System.out.println("Quantos lanches foram consumudos na terceiera hora : ");
        lanche03 = entrada.nextInt();

        //total e media
        total = lanche01 + lanche02 + lanche03 ;
        media = total/3 ;

        //saida de dados
        System.out.println("Total de lanches consumidos : " + total);
        System.out.println("Media de lanche por hora : " + media);

        //fechando o scanner para evitar tretas
        entrada.close();
    }
}