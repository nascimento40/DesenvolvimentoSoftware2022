public class Fatorial {
    public static long calcular(int num) throws IllegalArgumentException {
        if (num >= 0) {
            // calcula o fatorial e retorna
            long fat = 1;
            for (int i = 2; i <= num; i++) {
                fat *= i; // fat = fat * i;
            }
            return fat;
        } else {
            throw new IllegalArgumentException("Não existe fatorial de número negativo!");
        }
    }
}
