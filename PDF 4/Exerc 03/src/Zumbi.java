public class Zumbi {
    double vida;
    String nome;

    double MostraVida() {
        System.out.println("O zumbi " + this.nome + " tem " + this.vida + " pontos de vida");
        return this.vida;
    }

    void trasfereVida(Zumbi zumbiAlvo, double quantia) {
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
        System.out.println("Vida transferida");
        System.out.println("O zumbi " + this.nome + " tem " + this.vida + " pontos de vida agora");
    }
}