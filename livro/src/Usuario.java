public class Usuario {
    private String nome;
    private String ID;

    public Usuario() {
    }

    public Usuario(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public void  emprestar_livro(Livro livro){
        if(livro.esta_disponivel()){
            livro.setDisponivel(false);
            System.out.println("Livro '" + livro.getTitulo() + "' emprestado para " + nome);
        }
        else {
            System.out.println("Livro '" + livro.getTitulo() + "' não está disponível.");
        }
    }

    public void devolver_livro(Livro livro){
        livro.setDisponivel(true);
        System.out.println("Livro '" + livro.getTitulo() + "' devolvido por " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
