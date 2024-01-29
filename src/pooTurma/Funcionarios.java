package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
		
			//Objetivo 1
			Administrativo funcionaria1 = new Administrativo(); 
			funcionaria1.nome = "Carlos";
			funcionaria1.emailCorporativo = "carlos@sp.senac.br";
			funcionaria1.redeDominio = "@sp.senac.br";
			funcionaria1.acessarSistema();
			
			Administrativo funcionario2 = new Administrativo();
			funcionario2.nome ="Joelma";
			funcionario2.emailCorporativo = "joelma@sesi.com.br";
			funcionaria1.redeDominio = "@sesi.com.br";
			funcionaria1.acessarSistema();
			

	}

}
