public class Livro extends Leitura {
    private String autor;
    private int anoPublicacao;
    private int numPaginas;
    private String isbn;

    public Livro() {

    }

    public Livro(int codigo, 
        String titulo,
        String editora, 
        String edicao,
        String autor,
        int anoPublicacao,
        int numPaginas,
        String isbn) {
        
        super(codigo, titulo, editora, edicao);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.isbn = isbn;        
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {        
        return super.toString() +
            String.format("Autor: %s\nAnoPublicao: %d\nNumPaginas: %d\nISBN: %s\n",
                this.autor,
                this.anoPublicacao,
                this.numPaginas,
                this.isbn
            );
    }
}
