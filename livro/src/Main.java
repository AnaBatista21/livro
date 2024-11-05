import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Java B�sico", "Autor 1", 2020, "123-4567890123");
        Livro livro2 = new Livro("Estruturas de Dados", "Autor 2", 2019, "987-6543210987");

        // Cria��o de inst�ncia de usu�rio
        Usuario usuario1 = new Usuario("Jo�o", "U001");

        // Cria��o da inst�ncia da biblioteca e adi��o dos livros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar_livros(livro1);
        biblioteca.adicionar_livros(livro2);

        biblioteca.listar_livros();

        Livro livroEmprestado = biblioteca.buscar_livro_por_titulo("Java B�sico");
        if (livroEmprestado != null) {
            usuario1.emprestar_livro(livroEmprestado);
        }

        // Listar livros dispon�veis ap�s o empr�stimo
        biblioteca.listar_livros();

//        // Usu�rio devolve o livro
         usuario1.devolver_livro(livroEmprestado);
//
//        // Listar livros dispon�veis ap�s a devolu��o
        biblioteca.listar_livros();
    }
}