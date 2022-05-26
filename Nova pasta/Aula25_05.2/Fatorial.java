public class Fatorial {
    public static long calcular(int num) {
        if (num >= 0) {
            // calcula o fatorial e retorna
            long fat = 1;
            for (int i = 2; i <= num; i++) {
                fat *= i; // fat = fat * i;
            }
            return fat;
        } else {
            // mostra o erro e retorna -1
            System.out.printf("Não existe fatorial de número negativo: %d!", num);
            return -1;
        }
    }
}
