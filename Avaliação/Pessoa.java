public class Pessoa {
    private int idade;
    private String nome;
    private char genero;
    private int Gostaviajar;
    private int Gostacozinhar;
    private int Gostacinema;
    private int Gostabalada;
    private int Gostaficaremcasa;

    public Pessoa() {

    }

    public Pessoa (int idade, String nome, char genero, int Gostaviajar, int Gostacozinhar, int Gostacinema, int Gostabalada, int Gostaficaremcasa) {
      this.idade = idade;
      this.nome = nome;
      this.genero = genero;
      this.Gostaviajar = Gostaviajar;
      this.Gostacozinhar = Gostacozinhar;
      this.Gostacinema = Gostacinema;
      this.Gostabalada = Gostabalada;
      this.Gostaficaremcasa = Gostaficaremcasa;
    }

    public int getIdade() {
      return idade;
    }
    public String getNome() {
      return nome;
    }
    public char getGenero() {
      return genero;
    }
    public int getGostaviajar() {
      return Gostaviajar;
    }
    public int getGostacozinhar() {
        return Gostacozinhar;
    }
    public int getGostacinema() {
      return Gostacinema;
    }
    public int getGostabalada() {
      return Gostabalada;
    }
    public int getGostaficaremcasa() {
      return Gostaficaremcasa;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public void setGenero(char genero) {
      this.genero = genero;
    }
    public void setGostaviajar(int gostaviajar) {
      Gostaviajar = gostaviajar;
    }
    public void setGostacozinhar(int gostacozinhar) {
        Gostacozinhar = gostacozinhar;
    }
    public void setGostacinema(int gostacinema) {
      Gostacinema = gostacinema;
    }
    public void setGostabalada(int gostabalada) {
      Gostabalada = gostabalada;
    }
    public void setGostaficaremcasa(int gostaficaremcasa) {
      Gostaficaremcasa = gostaficaremcasa;
    }

    @Override
    public String toString() {
      return super.toString() + ":\n"
      + String.format("idade: %d\nnome: %s\ngenero: %c\nGostoviajar: %d\nGostacozinhar: %d\nGostacinema: %d\nGostabalada: %d\nGostaficaremcasa: %d", this.idade, this.nome, this.genero, this.Gostaviajar, this.Gostacozinhar, this.Gostacinema, this.Gostabalada, this.Gostaficaremcasa);
    }

    public double calcularCompatibilidade(Pessoa p){
        return Math.sqrt(Math.pow(this.Gostaviajar - p.Gostaviajar, 2) + Math.pow(this.Gostacozinhar - p.Gostacozinhar, 2) + Math.pow(this.Gostacinema - p.Gostacinema, 2) + Math.pow(this.Gostabalada - p.Gostabalada, 2) + Math.pow(this.Gostaficaremcasa - p.Gostaficaremcasa, 2));
    }
}