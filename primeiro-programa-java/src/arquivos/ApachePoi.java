package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	public static void main(String[] args) throws Exception {
		
		
		File file = new File("C:\\Users\\Jonatas\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
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
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook(); // vai ser usado para escrever a planilha
		
		HSSFSheet linhasPessoa = hssfworkbook.createSheet("Planilha de pessoas JDevTreinamento");//Criar planilha
		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++);//Criando a linha na planilha
			
			int celula =0 ;
			
			Cell celNome = linha.createCell(celula ++); // 
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula ++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula ++);
			celIdade.setCellValue(p.getIdade());
			
		}// fim do for e da planilha
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada");
		
		
		
		
		
	}
}
