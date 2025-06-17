import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;
import br.inatel.cdg.Conversor;


public class Main {
    public static void main(String[] args) {

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();

        System.out.println("Blocos em jogo = "+Bloco.getNumBlocos());

        Jogador jogador = new Jogador();
        jogador.destruirBlocos(bloco1);

        System.out.println("Bloco em jogo = "+Bloco.getNumBlocos());
        System.out.println("Pontos do jogador = "+jogador.getPonto());

        jogador.destruirBlocos(bloco2);

        System.out.println("Bloco em jogo = "+Bloco.getNumBlocos());
        System.out.println("Pontos do jogador = "+jogador.getPonto());

        jogador.destruirBlocos(bloco3);
        jogador.destruirBlocos(bloco4);

        int x = jogador.getPonto();
        Conversor.converte(x);





    }
}