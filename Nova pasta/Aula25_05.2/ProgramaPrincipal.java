public class ProgramaPrincipal {
    public static void main(String[] args) {
        int num = ConsoleUtils.LerInteiro("Dígite um inteiro:");
        long fat = Fatorial.calcular(num);
        if (fat == -1) {
            System.out.println("\nNão foi possível calcular.");
        } else {
            System.out.printf("\n%d! = %d", num, fat);
        }
    }
}
