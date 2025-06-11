public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Valentino Rossi";
        piloto2.nome = "Marc Marquez";

        piloto1.vilao = false;
        piloto2.vilao = true ;

        kart1.nome = "Yamaha";
        kart1.motor.cilindrada = "150 cilindradas" ;
        kart1.motor.velocidadeMaxima = 150 ;

        kart2.nome = "Honda";
        kart2.motor.cilindrada = "100 Cilindradas" ;
        kart2.motor.velocidadeMaxima = 130;

        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();

        kart1.fazerDrift();
        kart1.pular();
        kart1.soltarTurbo();

        kart2.soltarTurbo();
        kart2.pular();
        kart2.fazerDrift();

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();
    }
}