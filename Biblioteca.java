package checkpoint1;

public class Biblioteca extends Livro{

    private String nome;
    private String endereco;
    private String email;
    private Integer telefone;

    public Biblioteca(String nome, String endereco, String email, Integer telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

}
