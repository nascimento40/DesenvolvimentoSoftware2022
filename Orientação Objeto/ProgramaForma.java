public class ProgramaForma {
    public static void main(String[] args) {
        FormaGeometrica obj1 = new FormaGeometrica();
        System.out.println(obj1.toString() + " - " + obj1.getCorPreenchimento());

        // Circulo obj2 = new Circulo();
        // System.out.println(obj2 + " - " + obj2.getCorPreenchimento());
        FormaGeometrica obj2 = new Circulo();
        System.out.println(obj2.toString() + " - " + obj2.getCorPreenchimento());

        // Retangulo obj3 = new Retangulo();
        // System.out.println(obj3 + " - " + obj3.getCorPreenchimento());
        FormaGeometrica obj3 = new Retangulo();
        System.out.println(obj3.toString() + " - " + obj3.getCorPreenchimento());

        // Triangulo obj4 = new Triangulo();
        // System.out.println(obj4 + " - " + obj4.getCorPreenchimento());
        FormaGeometrica obj4 = new Triangulo();
        System.out.println(obj4.toString() + " - " + obj4.getCorPreenchimento());    
    }
}
