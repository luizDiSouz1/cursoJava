package pooTurma;

public class Alunos {

	public static void main(String[] args) {
		//Objetivo 1
		Turma aluno1 = new Turma();// turma = classe 
		
		aluno1.nome = "Nathan";
		aluno1.telefone = "11992682158";
		aluno1.email = "nathan.martins2004@gmail.com";
		System.out.println("Nome do aluno: " + aluno1.nome);
		System.out.println("Telefone: " + aluno1.telefone);
		System.out.println("Email do aluno: " + aluno1.email);
		aluno1.ligarPc();
		aluno1.logar();
		aluno1.beberAguaAluno();
		
		//Objetivo 2
		
		Turma aluno2 = new Turma();
		aluno2.nome = "Vitoria";
		aluno2.telefone = "11992682558";
		aluno2.email = "vitoriaricardoso@gmail.com";
		System.out.println("Nome do aluno: " + aluno2.nome);
		aluno2.ligarPc();
		aluno2.desligarPc();
	}
		private void beberAgua() {
			System.out.println("Ir ao bebedouro para beber água");
		}
}
