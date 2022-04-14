/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int RGM;
    private String nome;
    private int AnoIngresso;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int RGM, String nome, int AnoIngresso)
    {
        this.RGM = RGM;
        this.nome = nome;
        this.AnoIngresso = AnoIngresso;
    }
    
    // Getters e setters
    public int getRGM() {
        return this.RGM;
    }
    
    public String getnome() {
        return this.nome;
    }
    
    public int getAnoIngresso() {
        return this.AnoIngresso;
    }
    
    public void setRGM(int RGM) {
        this.RGM = RGM;
    }
    
    public void setnome(String nome) {
        this.nome = nome;
    }
    
    public void setAnoIngresso(int AnoIngresso) {
        this.AnoIngresso = AnoIngresso;
    }
    
    @Override
    public String toString() {
        return super.toString() + ":\n"
        + String.format("RGM: %d\nNome: %s\nAnoIngresso: %d", this.RGM, this.nome, this.AnoIngresso);
    }
}