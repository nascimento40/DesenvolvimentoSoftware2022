public class ProgramaPrincipal {
    public static void main(String[] args) {
        int num = ConsoleUtils.LerInteiro("Dígite um inteiro:");
        try {
            long fat = Fatorial.calcular(num);
            System.out.printf("%d! = %d", num, fat);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("\nPrograma terminado, volte sempre!");
        }
    }
}
