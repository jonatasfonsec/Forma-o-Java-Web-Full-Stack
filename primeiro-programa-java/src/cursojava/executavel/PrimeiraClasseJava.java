package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criacao de Objeto)
		aluno1 é uma referência para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento ?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF? ");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual serie?");
		String escola = JOptionPane.showInputDialog("Qual escola?");
		
		String disciplina1= JOptionPane.showInputDialog("Discilina1 ?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		
		String disciplina2= JOptionPane.showInputDialog("Discilina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Nota 2?");
		
		String disciplina3= JOptionPane.showInputDialog("Discilina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		
		String disciplina4= JOptionPane.showInputDialog("Discilina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Nota 4?");
		
		
		
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		

		System.out.println(aluno1); /*Descrição do objeto na memória*/
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		
		/*[FEITO]9.16 - Equals e hashcode(Diferenciar e comparar objetos)*/

		
		
		
		
		
		
		
		
		
		
	}
}
