import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionar_livros(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca.");
    }

    public List<Livro> listar_livros() {
        List<Livro> livrosDisponiveis = new ArrayList<Livro>();
        System.out.print("------- LISTA DE LIVROS DISPONIVEIS ------- \n");
        for(Livro livro : this.livros) {
            if(livro.esta_disponivel()){
                livrosDisponiveis.add(livro);
                System.out.println("- " + livro.getTitulo());
            }
        }
        return  livrosDisponiveis;
    }

    public Livro buscar_livro_por_titulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.esta_disponivel()) {
                return livro;
            }
        }
        System.out.println("Livro com o título '" + titulo + "' não está disponível.");
        return null;
    }
}
