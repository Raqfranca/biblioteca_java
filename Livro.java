package checkpoint1;

    public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private String categoria;
    private Integer quantidade;

    public Livro(String nome, String autor, String editora, String categoria, Integer quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public void livroDisponivel(){
        System.out.println("Existe " +  quantidade + " exemplares do livro "+ nome+ " disponível na cidade.");
    }

}
