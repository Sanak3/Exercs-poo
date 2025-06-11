public class Banda {

    private String nome ;
    private String genero;
    private Musica [] musicas = new Musica[3];
    private Membro [] membros = new Membro[4];
    private Empresario empresario;

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    void mostraInfo (){
        System.out.println("A banda "+this.nome);
        System.out.println("Possui os membros ");

        for (Membro membro : membros){
            if(membro!= null){
                System.out.println(membro.getNome());
            }
        }

        for (Musica musica : musicas){
            if(musica != null){
                System.out.println(musica.getNome());
            }
        }

    }

    void addMusicaNova (Musica novamusica){
        for(int i=0 ; i< musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = novamusica;
                break;
            }
        }
    }

    void addmembronovo (Membro novomembro){
        for (int i=0; i< membros.length; i++){
            if(membros[i]==null){
                membros[i] = novomembro;
                break;
            }
        }

    }

    public void setEmpresario(Empresario empresario){
        this.empresario = empresario;
    }

}
