

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu Programa de Operações Matemáticas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione operaçao desejada: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int operacao = sc.nextInt();
        System.out.println();
        System.out.println("Digite o primeiro número a ser computado: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número a ser computado: ");
        int num2 = sc.nextInt();
        System.out.println();
        switch (operacao) {
            case 1:
                System.out.println(soma(num1, num2));
                break;
            case 2:
                System.out.println(subtracao(num1, num2));
                break;
            case 3:
                System.out.println(multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println(divisao(num1, num2));
                break;
            default:
                System.out.println("operação não encontrada");
                break;
        }
        sc.close();
        System.out.println();
        System.out.println("fim do programa de operações matemáticas");
    }

    public static int soma(int x, int y){
        int result = x + y;
        return result;
    }

    public static int subtracao(int x, int y){
        int result = x - y;
        return result;
    }

    public static int multiplicacao(int x, int y){
        int result = x * y;
        return result;
    }

    public static float divisao(int x, int y){
        float result = x / (float)y;
        return result;
    }
}