import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar =  Calendar.getInstance();
		
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos " + date.getTime());
		System.out.println("Calendar em milisegundos " + calendar.getTimeInMillis());
		
		
		System.out.println("Dia do Mês: " + date.getDate());
		System.out.println("Calendar Dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da Semana: " + date.getDay());
		System.out.println("Calendar Dia da Semana: " + (calendar.get(Calendar.DAY_OF_WEEK)-1));
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		
		System.out.println("Minuto do dia: " + date.getMinutes());
		System.out.println("Calendar Minuto do dia: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundo do dia: " + date.getSeconds());
		System.out.println("Calendar Segundo do dia: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + date.getYear());
		System.out.println("Calendar Ano: " + calendar.get(calendar.YEAR));
		
		
		/*----------Simple Date Format---------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss"); //em banco de dados usar yyyy/MM/dd
		
		System.out.println("Data atual em formato padrao em String: "+simpleDateFormat.format(date));
		System.out.println("Calendar Data atual em formato padrao em String: "+simpleDateFormat.format(calendar.getTime()));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Calendar Data atual em formato para Banco de Dados: "+simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1986-06-04 20:05.00"));
		
	}
	
	
	
}
