import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("11/04/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("11/06/2022");
		
		if (dataVencimentoBoleto.before(dataAtualHoje)){
		 System.out.println("Boleto Vencido - URGENTE");
		}else {
		 System.out.println("Boleto não Vencido");
		}
	}
	
	
	
}
