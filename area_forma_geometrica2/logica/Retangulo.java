package logica;
public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo() {

    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String preencherCor() {
        return "Azul";
    }
}
