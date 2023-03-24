import java.util.Scanner;

public class atividade_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int calculo;
		
		System.out.println("Digite um numero de 1 a 100: ");
		numero=entrada.nextInt();
		
		calculo = (numero%2);
		
		if (numero<=100 && numero>=1 && calculo == 0) {
			
			System.out.println("Numero Par");
			
			
		}else if (numero<=100 && numero>=1 && calculo == 1) {
			
			System.out.println("Numero Impar");
			
		}else {
			
			System.out.println("numero invalido");
			
		}
		
		
	}

}
