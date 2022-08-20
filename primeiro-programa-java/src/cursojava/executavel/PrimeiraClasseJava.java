package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if(login.equalsIgnoreCase("admin") &&
				senha.equalsIgnoreCase("admin")) {
		
		
		

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*� uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tamb�m*/
		HashMap<String, List<Aluno>> maps = new HashMap<String,List<Aluno>>();
		

		for (int qtd = 1; qtd <= 3; qtd++) {
			/*
			 * new Aluno() � uma instancia (Criacao de Objeto) aluno1 � uma refer�ncia para
			 * o objeto aluno
			 */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento ?"); String
			 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual � o CPF? "); String mae =
			 * JOptionPane.showInputDialog("Nome da m�e?"); String pai =
			 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual serie?"); String escola =
			 * JOptionPane.showInputDialog("Qual escola?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

//			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
//
//			if (escolha == 0) { /* Op��o SIM e Zero */
//
//				int continuarRemover = 0;
//				int posicao = 1;
//
//				while (continuarRemover == 0) {
//					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4? ");
//					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
//					posicao++;
//					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
//				}
//			}

			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) { /*Separei em listas*/
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
			System.out.println("-----------------Lista dos Aprovados"+"[TOTAL="+maps.get(StatusAluno.APROVADO).size()+"]-----------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno: " + aluno.getNome() + ". Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = " + aluno.getMediaNota());			
		    }
			
			System.out.println("-----------------Lista dos Reprovados"+"[TOTAL="+maps.get(StatusAluno.REPROVADO).size()+"]-----------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno: " + aluno.getNome() + ". Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = " + aluno.getMediaNota());
			}
			System.out.println("-----------------Lista dos Recuperacao"+"[TOTAL="+maps.get(StatusAluno.RECUPERACAO).size()+"]-----------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno: " + aluno.getNome() + ". Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = " + aluno.getMediaNota());
			}
			
			
		}//fim do if.
		
		JOptionPane.showMessageDialog(null, "Login/Senha inv�lidos","Erro:",JOptionPane.ERROR_MESSAGE);
		
	}
}
