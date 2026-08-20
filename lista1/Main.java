public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("Interestelar", "Ficção Científica", 2014);
        Filme f2 = new Filme("Toy Story", "Animação", 1995);

        System.out.println(f1.titulo + " - " + f1.genero + " - " + f1.anoLancamento);
        System.out.println(f2.titulo + " - " + f2.genero + " - " + f2.anoLancamento);

        Autor autor1 = new Autor("George Orwell", "Britânico");
        Livro livro1 = new Livro("1984", 1949, autor1);

        Autor autor2 = new Autor("Machado de Assis", "Brasileiro");
        Livro livro2 = new Livro("Dom Casmurro", 1899, autor2);

        System.out.println(livro1);
        System.out.println(livro2);
    }
}
