package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Joao");
		pessoa1.setEmail("Joao@gmail");
		pessoa1.setIdade("30");
		
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maria");
		pessoa2.setEmail("Maria@gmail");
		pessoa2.setIdade("25");
		
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Pedro");
		pessoa3.setEmail("Pedro@gmail");
		pessoa3.setIdade("17");
		
		
		/*Pode vir do banco de dados ou qualquer fonte de dados*/
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		File arquivo = new File("C:\\Users\\Jonatas\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getIdade() + ";" + p.getEmail() + "\n" );
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		
	}
	
	
}
