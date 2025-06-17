import br.inatel.cdg.brownie.Brownie;
import br.inatel.cdg.brownie.sabores.BrownieCafe;
import br.inatel.cdg.brownie.sabores.BrownieDoceDeLeite;
import br.inatel.cdg.brownie.sabores.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        BrownieCafe brownieCafe = new BrownieCafe("BW de Cafe", "Cafe" , 10);
        BrownieNutella brownieNutella = new BrownieNutella("BW de nutella", "Nutella",15);
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("BW de Doce de Leite", "Doce de Leite" , 10);

        brownieCafe.adicionaCafe();
        System.out.println(" ");
        brownieNutella.adicionaNutella();
        System.out.println(" ");
        brownieDoceDeLeite.adicionaDoceDeLeite();
        System.out.println(" ");
        brownieCafe.mostraInfo();
        brownieNutella.mostraInfo();
        brownieDoceDeLeite.mostraInfo();
        brownieCafe.addCarrinhoDeCompras();
        brownieCafe.calculaValorTotal();
        System.out.println(" ");
        brownieNutella.addCarrinhoDeCompras();
        brownieNutella.calculaValorTotal();
        System.out.println(" ");
        brownieDoceDeLeite.addCarrinhoDeCompras();
        brownieDoceDeLeite.calculaValorTotal();
    }
}