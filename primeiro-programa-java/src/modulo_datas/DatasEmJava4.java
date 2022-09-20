package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

	//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2022");
	
	long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-09-20"),LocalDate.now());
	
	System.out.println("Possui " + dias + " entra a faixa de data");
	
		
	}

}
