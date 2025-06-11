public class Main {
    public static void main(String[] args) {

        Empresario empresario = new Empresario("Van halen", 1234567);
        Musica musica1 = new Musica("Alkaline" , 4);
        Musica musica2 = new Musica("Dangerous", 4);
        Musica musica3 = new Musica("Take back to eden" , 7);

        Membro membro1 = new Membro("Vessel", "Vocalista");
        Membro membro2 = new Membro("II", "Baterista");
        Membro membro3 = new Membro("III" , "Baixista");
        Membro membro4 = new Membro("IV", "Guitarrista");

        Banda banda = new Banda("Sleep Tolken","Prog Metal");
        banda.setEmpresario(empresario);
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMusicaNova(musica3);

        banda.addmembronovo(membro1);
        banda.addmembronovo(membro2);
        banda.addmembronovo(membro3);
        banda.addmembronovo(membro4);

        banda.mostraInfo();


    }
}