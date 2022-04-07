
import java.util.Scanner;

public class CalculadoraFatorial{
	public static void main(String[]args){
        int numero;
        int fatorial = 1;
	
	    Scanner input = new Scanner(System.in);
 
	    System.out.println("Digite o número que deseja calcular o fatorial:");
	   
        numero = input.nextInt();

        int i=1;
		if (numero == 0){
			System.out.println("O fatorial de 0 é: 1");
		}
	    else if (numero < 0){
			System.out.println("Insira um número válido!");
		}
		else{
		do{
	    fatorial=fatorial*i;
        i++;
 	    }
        while (i<=numero);
  	    System.out.println("O fatorial de "+numero+" é: "+fatorial);
		}
	input.close();
	}
}