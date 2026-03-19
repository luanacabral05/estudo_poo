public class q1 {
    public static void main(String[] args) {
        Locadora locadora = new Locadora("Locadora Central");

        Filme f1 = new Filme("O Senhor dos Aneis", "Fantasia", 2001);
        Filme f2 = new Filme("Matrix", "Ficcao Cientifica", 1999);
        Filme f3 = new Filme("Interestelar", "Ficcao Cientifica");

        locadora.adicionarFilme(f1);
        locadora.adicionarFilme(f2);
        locadora.adicionarFilme(f3);

        locadora.listarFilmes();
    }
}
