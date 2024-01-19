package logicaDeProgramacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char sexo = 'M';
		
			if (sexo =='F' || idade <= 18 ) {
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
			
			
			
			
			System.out.println("Uso do switch-case");
			System.out.println("Opção 1: Relatório de clientes");
			System.out.println("Opção 2: Relatório de funcionários");
			System.out.println("Opção 3: Relatório de vendas");
			
			int opcao = 3;
			
			switch(opcao){
			case 1:
				System.out.println("Relatorio de clientes");
				break;
			
			case 2:
				System.out.println("Relatório de funcionários");
				break;
			
			case 3:
				System.out.println("Relatorio d vendas");
				break;
			
			default:
				System.out.println("Opção inválida");
				break;
		}	
			
		int idade1 = 1;
		int idade2 = 2;
		int idade3 = 3;
		int idade4 = 4;
		int idade5 = 5;
		double media = 1;
		
		media = (idade1 + idade2 + idade3 + idade4 + idade5) / 5;
		
		System.out.println(media);
			
	}

}
