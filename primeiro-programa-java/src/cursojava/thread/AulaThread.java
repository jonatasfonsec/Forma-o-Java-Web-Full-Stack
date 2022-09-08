package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		new Thread(){
			
			public void run() {/*Executa o conteúdo da thread*/
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
			};
			
		}.start();/*Liga a thread*/
		/*Código do sistema continua o fluxo*/
		/**/
		JOptionPane.showMessageDialog(null, "Sistema executando...");
		//System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD.");
	}
}
