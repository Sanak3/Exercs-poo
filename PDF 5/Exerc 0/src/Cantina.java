public class Cantina {
    String nome ;
    Salgado[] salgados = new Salgado[3];

    void addSalgado (Salgado novoSalgado){
        for (int i = 0 ; i< salgados.length; i++) //Corre o array
            if(salgados[i] == null){  //verifica de a posiçao é nula, e se for add novo salgado
                salgados[i] = novoSalgado;
                break ;

            }
                else{
                System.out.println("Todas as posiçoes ja foram preenchidas");
                }
    }

    void mostraInfo (){
        System.out.println("A cantina : ");
        System.out.println(this.nome + " possui os salgados a baixo");
        for (Salgado salgado : salgados){
            //no caso, vem (Classe Nome : array), o foreach funciona melhor por que o indice seria inutil
            if(salgado != null){
                System.out.println(salgado.nome);
            }

        }
    }


}
