package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setNomeEscola("JDev - Treinamento");
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("asdfasdfasd");
		diretor.setNome("Egidio");
		
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("8181684");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
	}

}
