package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
			
	
		//********************/
		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();	

		
		JOptionPane.showMessageDialog(null, "Sistema executando...");
		//System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD.");
	}
	
	private static Runnable thread2 = new Runnable() {
		public void run() {
			for (int pos = 0; pos < 10;pos++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*Quero executar esse envio com um intervalo.*/
				System.out.println("Executando alguma rotina, por exemplo: envio de nota fiscal.");
			}
			
			
			
		};
	};
	
	
	
	private static Runnable thread1 = new Runnable() {
		public void run() {
			/*Código da rotina*/
			
			for (int pos = 0; pos < 10;pos++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*Quero executar esse envio com um intervalo.*/
				System.out.println("Executando alguma rotina, por exemplo: envio de e-mail.");
			}
			
		}
		
	};
}
