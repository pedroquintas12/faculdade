import java.util.Scanner;

public class atividade_4 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int Idade;
		int Filme;
		
		System.out.println("qual a sua idade? ");
		Idade=entrada.nextInt();
		
		System.out.println("1- O exorcista , 2- Brinquedo assassino , 3- frozen");
		
		System.out.println("Que filme você quer assistir? ");
		Filme=entrada.nextInt();
		
		
		if (Idade>=18) {
			
			System.out.println("Pode assistir!");
			
		}else if(Idade>=14 && Filme == 2 || Filme == 3) {
		
			System.out.println("Pode assistir o filme");
	
		}else if(Idade<=13 && Filme ==3 ) {
			
			System.out.println("Pode assistir o filme! ");
			
		}else {
			
			System.out.println("você não tem a idade indicativa!");
			
		}
	}
}
