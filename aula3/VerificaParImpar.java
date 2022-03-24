import java.util.Scanner;

public class VerificaParImpar {
    public static void main(String[] args) {
        System.out.println("Insira um número: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        input.close();

        if (numero % 2 == 0){
            System.out.println("par");
        }   else if (numero < 0){
            System.out.println("negativo");
        }   else {
            System.out.println("impar");
        }

    }
}
