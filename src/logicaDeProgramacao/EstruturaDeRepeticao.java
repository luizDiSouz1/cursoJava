package logicaDeProgramacao;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char sexo = 'F';
		
			if (sexo =='M') {
				System.out.println("Alistamento militar obrigatorio");
				
			}
				
			else {
				
				System.out.println("Não é necessário se alistar");
			}
			
			System.out.println("_________________________________________________");
			
			if(sexo == 'M') {
					if(idade >= 18) {
						System.out.println("Alistamento militar obrigatorio");
					}
					
					else {
						System.out.println("Você não tem a idade neessária");
					}
			}
			
			else {
				System.out.println("É preciso ser do sexo masculino para com obrigatoriedade");
			}
			
	}

}
