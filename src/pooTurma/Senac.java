package pooTurma;

public class Senac {
	String nome;
	String telefone;
	String emailPessoal;
 
//Métodos
	void ligarPc() {
		System.out.println("Computador ligado");
	}
	
	void logar() {
		System.out.println("Login feito com sucesso" + nome);
	}
	
	void desligarPc() {
		System.out.println("Computador desligado");
	}
	
	private void beberAgua() {
		System.out.println("Ir ao bebedouro para beber água");
	}
}