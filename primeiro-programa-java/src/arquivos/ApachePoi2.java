package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\Jonatas\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo.xls"));
		
		HSSFWorkbook hssfworkbook= new HSSFWorkbook (entrada);/*Prepara a entrada do arquivo excel par leitura*/
		HSSFSheet planilha = hssfworkbook.getSheetAt(0);/*Pega a primeira planilha do arquivo*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();/*Dados da pessoa na linha*/
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celulas.hasNext()) {
				Cell cell = celulas.next();
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(cell.getStringCellValue());
				}
			}
			pessoas.add(pessoa);
		}
		entrada.close();
		
		for (Pessoa pessoa:pessoas) {
			System.out.println(pessoa);
		}
		
		
		
	}
}
