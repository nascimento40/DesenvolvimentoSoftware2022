

import java.util.Scanner;

public class CalculadoraFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Fibonacci f(n)");
        System.out.println("Insira o valor de n:");
        try {
            int enesimo = sc.nextInt();
            long n1 = 0L, n2 = 1L;
            if (enesimo == 0) {
                System.out.println("O valor de f(0) = 0");
            } else if (enesimo == 1) {
                System.out.println("O valor de f(1) = 1");
            } else if (enesimo < 0) {
                System.out.println("Insira um valor positivo!");
            } else {
                for (int i = enesimo; i > 0; i--) {
                    System.out.print(n1 + " ");
                    long n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    sc.close();
                }
                System.out.println("<- este é o n-ésimo termo da sequência de Fibonacci!!!");
            }
        } catch (Exception e) {
            System.out.println("O numero enserido precisa ser um inteiro");
        }
    }
}