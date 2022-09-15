import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos" + date.getTime());
		
		System.out.println("Dia do Mês: " + date.getDate());
		
		System.out.println("Dia da Semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minuto do dia: " + date.getMinutes());
		
		System.out.println("Segundo do dia: " + date.getSeconds());
		
		System.out.println("Ano: " + date.getYear());
		
		
	}
	
	
	
}
