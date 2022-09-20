package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class DatasEmJava5 {

	public static void main(String[] args) throws ParseException {

		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/09/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for (int parcela = 1; parcela <= 12;parcela ++) {
			
			calendar.add(Calendar.MONTH,1);
			System.out.println("Parcela número: " +  parcela + " vencimento é em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
			
			
		}
		
		
		
		
	}

}
