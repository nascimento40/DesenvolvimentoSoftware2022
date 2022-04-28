import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoas [] = new Pessoa[6];
        pessoas[0] = new Pessoa(57, "Felipe", 'M', 90, 100, 80, 30, 70);
        pessoas[1] = new Pessoa(45, "Maria", 'F', 50, 70, 100, 50, 90);
        pessoas[2] = new Pessoa(30, "Cristiana", 'F', 50, 20, 30, 70, 30);
        pessoas[3] = new Pessoa(32, "Leonardo", 'M', 80, 10, 60, 80, 50);
        pessoas[4] = new Pessoa(27, "João", 'M', 100, 30, 50, 100,10);
        pessoas[5] = new Pessoa(45, "Jéssica", 'F', 85, 60, 70, 50, 60);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = teclado.nextInt();

        System.out.println("Nome: ");
        String nome = teclado.next();

        System.out.println("Genero: ");
        char genero = teclado.next().charAt(0);

        System.out.println("Gosta de viajar: ");
        int gostaviajar = teclado.nextInt();

        System.out.println("Gosta de cozinhar: ");
        int gostacozinhar = teclado.nextInt();

        System.out.println("Gosta de cinema: ");
        int gostacinema = teclado.nextInt();

        System.out.println("Gosta de Balada: ");
        int gostabalada = teclado.nextInt();

        System.out.println("Gosta de ficar em casa: ");
        int Gostaficaremcasa = teclado.nextInt();

        pessoas[i] = new Pessoa(idade, nome, genero, gostaviajar, gostacozinhar, gostacinema, gostabalada, Gostaficaremcasa );
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].toString());
        }

        teclado.close();
    }
}
