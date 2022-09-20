package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(2010, 2, 7);
		
		LocalDate dataNova = LocalDate.of(2022, 7, 4);
		
		System.out.println("Data antiga é maior que a data nova? : " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior que a data nova? : " + dataAntiga.isBefore(dataNova));
		
		System.out.println("As datas são iguais? : " + dataAntiga.isEqual(dataNova));
		
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias entre o período das datas: " + periodo.getDays());
		
	}

}
