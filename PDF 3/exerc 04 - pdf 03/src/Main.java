import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alunos ;

        System.out.println("Digite a quantidade de alunos matriculados : ");
        alunos = entrada.nextInt();

        switch (alunos){
            case 10 :
            case 20 :
                System.out.println("A aula sera na sala I-16");
                break;

            case 30 :
                System.out.println("A aula sera na sala I-20");
                break ;

            default:
                System.out.println("Numero incorreto de alunos matriculados");
                break ;
        }
        entrada.close();
    }
}