public class Zumbi {
        int vida  ;
        int velocidade ;

        void MostraVida () {
            System.out.println("Vida do Zumbi : " + vida );
        }

        void Andar () {
            velocidade = 10 ;
            System.out.println("o Zumbi esta andando ");
            System.out.println("Velocidade Atual = " + velocidade + " passos por min") ;
        }

        void Correr () {
            velocidade = 25 ;
            System.out.println("Seu zumbi esta correndo ");
            System.out.println("Velocidade Atual = " + velocidade + " passos por min");
        }

        void ZumbiAtacado () {
             vida -= 50;
            System.out.println("Seu Zumbi foi atacado, vida atual : " + vida);
        }

        void ZumbiRegenerar () {
            vida += 100;
            System.out.println("Seu zumbi renegenerou, vida atual : " + vida );
        }
    }
