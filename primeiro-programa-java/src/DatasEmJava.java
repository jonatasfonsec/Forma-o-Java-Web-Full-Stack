import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos" + date.getTime());
		
		System.out.println("Dia do Mês: " + date.getDate());
		
		System.out.println("Dia da Semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minuto do dia: " + date.getMinutes());
		
		System.out.println("Segundo do dia: " + date.getSeconds());
		
		System.out.println("Ano: " + date.getYear());
		
		
		/*----------Simple Date Format---------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss"); //em banco de dados usar yyyy/MM/dd
		
		System.out.println("Data atual em formato padrao em String: "+simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual em formato para Banco de Dados: "+simpleDateFormat.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1986-06-04 20:05.00"));
		
	}
	
	
	
}
