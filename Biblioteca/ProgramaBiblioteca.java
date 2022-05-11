import java.util.Date;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro(
            1, 
            "Livro teste", 
            "Editora teste", 
            "1a edicao", 
            "Pedro", 
            2015, 
            417, 
            "123456789"
        );
        System.out.println(livro.toString());

        Revista revista = new Revista(
            1, 
            "Revista teste", 
            "Editora teste", 
            "Edicao teste", 
            new Date(2022, 5, 4), 
            "Editorial teste", 
            "Reportagem teste"
        );

        System.out.println(revista);
    }
}
