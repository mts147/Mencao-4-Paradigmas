public class VestuarioMain {

    public static void main(String[] args) {
        GuardaRoupas guardaRoupas = new GuardaRoupas();

        Esporte camiseta = new Esporte();
        camiseta.setCor("preta");
        camiseta.setDescricao("manga media");
        camiseta.setManequim(32);
        camiseta.setEstampa("Lisa");
        camiseta.setSituacao("Suja");

        Social terno = new Social();
        terno.setCor("cinza");
        terno.setDescricao("Armani");
        terno.setEstampa("Lisa");
        terno.setSituacao("Lavanderia");
        terno.setManequim(44);

        Social camisa = new Social();
        camisa.setCor("Cinza");
        camisa.setDescricao("Manga Longa linho");
        camisa.setEstampa("Lisa");
        camisa.setManequim(40);

        Fardamento bata = new Fardamento();
        bata.setCor("azul");

        Esporte polo = new Esporte();
        polo.setCor("preto");
        polo.setManequim(42);

        GuardaRoupas.addRoupa( guardaRoupas.armario, camiseta );
        GuardaRoupas.addRoupa( guardaRoupas.lavanderia, terno );
        GuardaRoupas.addRoupa( guardaRoupas.emUso, camisa );
        GuardaRoupas.addRoupa( guardaRoupas.armario, bata );

        GuardaRoupas.confereRoupas( guardaRoupas.armario );
        GuardaRoupas.contarRoupas(guardaRoupas.armario);

    }
}