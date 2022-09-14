package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}

	@Override
	public void run() {
		Iterator iteracao = pilha_filha.iterator();

		synchronized (iteracao) { /*Bloqueia o acesso a esta lista por outros processos*/
		while (iteracao.hasNext()) { /* Enquanto conter dados na lista irá processar */

			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /* Pega o objeto atual */

			/* Exemplo de processo 1: Processar 10 mil notas fiscais */
			/* Exemplo de processo 2: Gerar uma lista enorme de pdf */
			/* Exemplo um envio em massa de email */
			
			System.out.println("-------------------------------");
			System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			

			iteracao.remove(); /* Remove para o próximo objeto */
			try {
				Thread.sleep(100); /* Dar um tempo para descarga de memória */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}		
		try {
			Thread.sleep(1000); /*Processou toda lista de objetos, dá um tempo para a limpeza de memória*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
