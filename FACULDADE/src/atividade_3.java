import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		float N1;
		float N2;
		float N3;
		float Operacao;
		float Resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		N1=entrada.nextFloat();
		
		System.out.println("Digite o segundo numero");
		N2=entrada.nextFloat();
		
		System.out.println("Digite o terceiro numero");
		N3=entrada.nextFloat();
		
		System.out.println("1- Soma , 2- divisão, 3- multiplicação , 4- subtração");
		
		System.out.println("Qual operação você quer usar?");
		Operacao=entrada.nextFloat();
		
		
		if (Operacao == 1){
			
			Resultado = (N1+N2+N3);
			
		}if (Operacao == 2){
			
			Resultado=(N1/N2/N3);
		
		}if (Operacao == 3){
		
		Resultado = (N1*N2*N3);
		
	    }if (Operacao == 4){
	    	
	    	Resultado= (N1-N2-N3);
	    	
	    }
	    System.out.println("seu resultado é:" + Resultado);
	}
}
