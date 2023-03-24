import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int Idade;
		double Preço;
		String Nome;
		int EsEntrete; //variavel que vai receber qual local o cliente quer ir
		
		int Comida; //recebe a variavel comida
		int Bebida;//recebe a variavem bebida
		double total;
	///	-------------------------------------------Preços dos produtos/lugares--------------------------------------------------------
		
		//vairaveis praia//
		String Spraia= "Praia";
		double Praia = 150.00;
		
		String Scamarao="Camarao";
		double Pcamarao = 50.00;
		
		String Scarangueijo="Carangueijo";
		double Pcarangueijo = 60.00;
		
		String Speixada="Peixada";
		double Ppeixada= 150.00;
		
		
		
		double Cidade = 200.00;
		double Interior = 100.00;
		
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		
		System.out.println("seja bem vindo(a) ao programa de viagem Melhor Viagem, "
				+ "Me chamo Pedro e vou ajudar você a escolher os melhores enteterimentos para a sua viagem");
		
		System.out.println("Qual o seu Primeiro Nome? ");
		Nome=entrada.next();
		
		System.out.println( "Ola "+ Nome + ", seja bem vindo(a), vamos comecar?");
		
		System.out.println("Que tipo de entreterimento voce quer ir?");
		System.out.println("[1] Praia "+"- "+Praia);
		System.out.println("[2] Cidade "+"- "+Cidade);
		System.out.println("[3] Interior "+"- "+Interior);
		
		EsEntrete = entrada.nextInt();
		
		
		if(EsEntrete ==1) {
			
			System.out.println("Pegar um sol né? Otima escolha!");
	
		}else if(EsEntrete ==2) {
			
			System.out.println("Sua vibe é mais movimentada, certo?");
					
			
		}else if (EsEntrete == 3) {
			
			System.out.println("Você quer tirar umas ferias da vida movimentada da cidade grande né?!");
			
				
		}else {
			
			System.out.println("digite um numero valido!!!");
			
		}
		
		System.out.println("otima escolha!!");
		Comida=entrada.nextInt();
		
		
		if(EsEntrete==1) {
			
			System.out.println("Que tal escolher qual vai ser a sua comida por la?!");
			System.out.println("[1]"+Scamarao + "-" +Pcamarao);
			System.out.println("[2]"+Scarangueijo + "-" +Pcarangueijo);
			System.out.println("[3]"+Speixada + "-"+Ppeixada);
			System.out.println("otima escolha!!");
			
			
		}else if(EsEntrete ==2){
		
			System.out.println("1- Rodizio de carne, 2- Rodizio de sushi, 3- Comida de rua, 4- nenhuma escolha");
			System.out.println("otima escolha!!");
			
		}else if(EsEntrete == 3) {
			
			System.out.println("1- buchada, 2- comida regional, 3- carne de sol   ");
			System.out.println("otima escolha!!");
				
		}else if (EsEntrete == 4) {
			
			System.out.println("Nao quer nada? Ok");
			
		}else {
			
			System.out.println("digite um valor valido");
			
		}
		
		
		
		System.out.println("Oque voce quer beber? ");
		
		if(EsEntrete ==1||EsEntrete==2||EsEntrete==3||EsEntrete==4) {
			
			System.out.println("1- coca cola, 2- agua, 3- cerveja, 4- nada"); 
			
			
		}else {
			
			System.out.println("informe um numero valido");
		}
		
		Bebida=entrada.nextInt();
		
		
		System.out.println("olá "+ Nome +", aqui estão os itens que voce escolheu: ");
		System.out.println("De entreterimento voce escolheu: "+EsEntrete);
		System.out.println("De comida voce escolheu: ");
		System.out.println("De bebida voce escolheu: " + Bebida);
		
		
		
		
	
	
	}
}
