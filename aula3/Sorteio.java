import java.util.Random;

public class Sorteio {
    // Atributos, propriedades, variaveis globais

    // Funcoes e procedimentos

    // Rotina principal

    public static void main(String[] args) {
        Random gerador = new Random();
        int c = 1;
        int soma = 0;
        int maior = 0;
        int menor = 101;
        while (c <= 1000){
            // ler o numero
            int n = 1 + gerador.nextInt(100);
            c++; //c += 1 ou c = c + 1
            System.out.println(n);
            soma = soma + n;
            if (n > maior) {
                maior = n;
            }
            if (n < menor){
                menor = n;
            }
        }
        float media = soma / 1000;
        System.out.println("Soma é:"+ soma);
        System.out.println("Média é:"+ media);
        System.out.println("Maior é:"+ maior);
        System.out.println("Menor é:"+ menor);
    }
}