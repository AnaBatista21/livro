public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private boolean disponivel = true;

    public Livro() {
    }

    public Livro(String titulo, String autor, int ano, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    public void exibir_detalhes(){
        System.out.println("T�tulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publica��o: " + ano);
        System.out.println("ISBN: " + isbn);
        System.out.println("Dispon�vel: " + (disponivel ? "Sim" : "N�o"));
    }

    public boolean esta_disponivel(){
        return this.disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
