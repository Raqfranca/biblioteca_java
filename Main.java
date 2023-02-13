package checkpoint1;

public class Main {
    public static void main(String[] args){

    Biblioteca bibliotecaRute = new Biblioteca("Rute Rocha", "Rua 27 de agosto, 256","rute_rocha@gmail.com", 1161654656);
    Biblioteca bibliotecaMachado = new Biblioteca("Machado de Assis", "Avenida Senador Vergueiro, 4419","machado_assis@gmail.com", 1181763487);
    Biblioteca bibliotecaCarolina = new Biblioteca("Carolina Maria de Jesus", "Rua Jurubatuba, 1876","carolina_maria@gmail.com", 1935647895);

    Livro livroPercy = new Livro("Percy Jackson - O Ladrão de Raios", "Rick Riordan", "Intrínseca", "Infantojuvenil", 7);
    Livro livroHarry = new Livro("Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", "Rocco", "Infantojuvenil", 10);
    Livro livroCrepusculo = new Livro("Crepúsculo", "Stephenie Meyer", "Intrínseca", "Infantojuvenil", 8);

    livroCrepusculo.livroDisponivel();


    Associado associadoRaquel = new Associado("Raquel", "Oliveira", "raqoliveira@gmail.com", 22211144, 1198754879);
    Associado associadoMatheus = new Associado("Matheus", "Silva", "matheusSilva@gmail.com", 48965772, 1198758779);
    Associado associadoAngela = new Associado("Angela", "Reis", "reis68@gmail.com", 1117111241, 1196654879);

    }
}
