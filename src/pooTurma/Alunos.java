package pooTurma;

public class Alunos {

	public static void main(String[] args) {
		//Objetivo 1
		Turma aluno1 = new Turma();// turma = classe 
		
		aluno1.nome = "Nathan";
		aluno1.telefone = "11992682158";
		aluno1.emailPessoal = "nathan.martins2004@gmail.com";
		aluno1.emailEducacional = "nathan.mraphael@senacsp.edu.br";
		aluno1.mencao = "D";
		System.out.println("Nome do aluno: " + aluno1.nome);
		System.out.println("Telefone: " + aluno1.telefone);
		System.out.println("Email do pessoal: " + aluno1.emailPessoal);
		System.out.println("Email do educacional: " + aluno1.emailEducacional);
		aluno1.ligarPc();
		aluno1.logar();
		aluno1.unidadeCurricular();
		
		
		//Objetivo 2
		
		Turma aluno2 = new Turma();
		aluno2.nome = "Vitoria";
		aluno2.telefone = "11992682558";
		aluno2.emailPessoal = "vitoriaricardoso@gmail.com";
		aluno2.emailEducacional = "victoriac@senacsp.edu.br";
		aluno1.mencao = "D";
		System.out.println("Nome do aluno: " + aluno2.nome);
		System.out.println("Email do aluno: " + aluno1.emailPessoal);
		System.out.println("Email educacional: " + aluno2.emailEducacional);
		aluno2.ligarPc();
		aluno2.unidadeCurricular();
		aluno2.desligarPc();
	}
		
}
