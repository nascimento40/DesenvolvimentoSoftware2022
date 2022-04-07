import java.util.Scanner;

public class JogoLoteria {
   
     
    static int dezena = 6;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] sorteio = sorteaSena();
        int[] aposta = new int[dezena];

        //trecho processa a aposta
        System.out.println("Faça sua aposta: ");
        for (int i = 0; i < dezena; i++) {
            int nroAposta;
            boolean repetido = false;

            do {
		System.out.print("Informe a dezena "+(i+1)+": ");
                nroAposta = teclado.nextInt();
                if (nroAposta <= 0) {
                    System.out.println("Número inválido, aposta cancelada!");
                    return;
                }
                repetido = existeNumero(aposta, nroAposta);
                if (repetido) {
                    System.out.println("Ops, número repetido!");
                }
            } while(repetido); 
            aposta[i] = nroAposta;
        }

	System.out.println("\nConfira sua aposta: ");
        for (int i = 0; i < aposta.length; i++) {
             System.out.print(aposta[i] + " ");
        }

        System.out.println("\nResultado do sorteio: ");
        for (int i = 0; i < sorteio.length; i++) {
             System.out.print(sorteio[i] + " ");
        }

        int nroAcertos = contaAcertos(sorteio, aposta);
        System.out.println("\nNúmero de acertos: "+nroAcertos);
        if(nroAcertos== 1){
            System.out.println("Seu premio é: nada");
        }else if(nroAcertos == 2){
            System.out.println("Seu premio é: nada");
        }else if(nroAcertos == 3){
            System.out.println("Seu premio é: nada");
        }else if(nroAcertos == 4){
            System.out.println("Seu premio é: 50.000,00");
        }else if(nroAcertos == 5){
            System.out.println("Seu premio é: 250.00,00");
        }else if(nroAcertos == 6){
            System.out.println("Seu premio é: 1.000.000,00");
        }else{
            System.out.println("Seu premio é: nada");
        }
        

        switch (nroAcertos) {
            case 4: System.out.println("Parabéns. Você acertou a quadra!"); break;
            case 5: System.out.println("Parabéns. Você acertou a quina!"); break;
            case 6: System.out.println("Parabéns. Você é campeão da MegaSena!"); break;
            default: System.out.println("Não foi dessa vez. Tente novamente!"); break;
        }
    }

    static int[] sorteaSena() {
        int[] resultado = new int[dezena];
        
        for (int i = 0; i < dezena; i++) {
            int sorteado;
            boolean repetido = false;

            do {
                sorteado = (int) (Math.random()*60)+1; 
                repetido = existeNumero(resultado, sorteado);
            } while(repetido); 

            resultado[i] = sorteado;
        }
        return resultado;
    }

  
    static int contaAcertos(int[] sorteio, int[] aposta) {
        int acertos = 0;
        for (int i = 0; i < dezena; i++) {
            int nroAposta = aposta[i];

           
            if (existeNumero(sorteio, nroAposta)) {
                acertos++;
            }
        }
        return acertos;
    }

   
    static boolean existeNumero(int[] numeros, int n) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                return true;
            }
        }
        return false;
    }
    
}