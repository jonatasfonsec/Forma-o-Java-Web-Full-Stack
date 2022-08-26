package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		try {
			
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) {/*
									 * Vou travar o contrato para autorizar somente quem realmente tem o contrato
									 * 100% legítimo
									 */
				/* Se true, acessa. Senão não acessa */

				// simulacao de erro
				//List<Aluno> alunos = null;

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * É uma lista que dentro dela temos uma chave que identifica uma sequencia de
				 * valores também
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {
					/*
					 * new Aluno() é uma instancia (Criacao de Objeto) aluno1 é uma referência para
					 * o objeto aluno
					 */

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					
					 String idade = JOptionPane.showInputDialog("Qual a idade?"); 
					 
//					 String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento ?");
//					 String rg = JOptionPane.showInputDialog("Registro Geral?");
//					 String cpf = JOptionPane.showInputDialog("Qual é o CPF? ");
//					 String mae = JOptionPane.showInputDialog("Nome da mãe?");
//					 String pai = JOptionPane.showInputDialog("Nome do pai?");
//					 String matricula = JOptionPane.showInputDialog("Data da matricula?"); 
//					 String serie = JOptionPane.showInputDialog("Qual serie?");
//					 String escola = JOptionPane.showInputDialog("Qual escola?");
					 
					 

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					
					/*
					 * 
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
//			if (escolha == 0) { /* Opção SIM e Zero */
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

				for (Aluno aluno : alunos) { /* Separei em listas */
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("-----------------Lista dos Aprovados" + "[TOTAL="
						+ maps.get(StatusAluno.APROVADO).size() + "]-----------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + ". Resultado = " + aluno.getAlunoAprovado2()
							+ " com média de = " + aluno.getMediaNota());
				}

				System.out.println("-----------------Lista dos Reprovados" + "[TOTAL="
						+ maps.get(StatusAluno.REPROVADO).size() + "]-----------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + ". Resultado = " + aluno.getAlunoAprovado2()
							+ " com média de = " + aluno.getMediaNota());
				}
				System.out.println("-----------------Lista dos Recuperacao" + "[TOTAL="
						+ maps.get(StatusAluno.RECUPERACAO).size() + "]-----------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno: " + aluno.getNome() + ". Resultado = " + aluno.getAlunoAprovado2()
							+ " com média de = " + aluno.getMediaNota());
				}

			} // fim do if.
			else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido", "Erro:", JOptionPane.ERROR_MESSAGE);

			}
			
			/*Aqui*/
			
		} catch (NumberFormatException e) {
			
			StringBuilder saida= new StringBuilder();
			
			/*Imprime erro no console Java*/
			e.printStackTrace();
			
			/*Mensagem do erro ou causa*/
			System.out.println(" Mensagem : " + e.getMessage());
			
			for(int pos = 0; pos < e.getStackTrace().length;pos++) {
				saida.append("\n Nome da classe: "+ e.getStackTrace()[pos].getClassName());
				saida.append("\n Nome do método: "+ e.getStackTrace()[pos].getMethodName());
				saida.append("\n Numero da linha: "+ e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());
			}
			
			

			JOptionPane.showMessageDialog(null, "Erro de conversão de números " + saida.toString());

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Null Pointer:  " + e.getClass());
		}
		
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado : " + e.getClass().getName());
		}finally { /*Sempre é executado ocorrendo erros ou não*/
			JOptionPane.showMessageDialog(null,"Você está aprendendo Java. Obrigado.");
		}

	}// fim do main
	
	private void lerArquivo() throws ExcecaoProcessarNota,FileNotFoundException {
		try {
		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e){
			throw new ExcecaoProcessarNota(e.getMessage());
		}

	}
	
	
	
}
