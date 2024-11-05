import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Java Básico", "Autor 1", 2020, "123-4567890123");
        Livro livro2 = new Livro("Estruturas de Dados", "Autor 2", 2019, "987-6543210987");

        // Criação de instância de usuário
        Usuario usuario1 = new Usuario("João", "U001");

        // Criação da instância da biblioteca e adição dos livros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar_livros(livro1);
        biblioteca.adicionar_livros(livro2);

        biblioteca.listar_livros();

        Livro livroEmprestado = biblioteca.buscar_livro_por_titulo("Java Básico");
        if (livroEmprestado != null) {
            usuario1.emprestar_livro(livroEmprestado);
        }

        // Listar livros disponíveis após o empréstimo
        biblioteca.listar_livros();

//        // Usuário devolve o livro
         usuario1.devolver_livro(livroEmprestado);
//
//        // Listar livros disponíveis após a devolução
        biblioteca.listar_livros();
    }
}