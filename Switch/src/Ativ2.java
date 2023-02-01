
public class Ativ2 {

	public static void main(String[] args) {
		// Switch usara valores pontuais 
		
		int numero = 8;
		
		switch(numero) { //dentro do parentese coloca um valor a ser testado, case que ira testar 
			 
			case 1:
				System.out.println("Voce digitou 1");
				break; //quando encontrar casa ira resolver os demais abaixo, se for para parar coloca-se "break"
			case 2:
				System.out.println("Voce digitou 2");
				break;
			case 3:
				System.out.println("Voce digitou 3");
				break;
				
			default: // default- ira testar outros casos que nao se encaixam no que foi colocado no codigo
				System.out.println("valor invalido");	
				
			
		}
	
	}

}
