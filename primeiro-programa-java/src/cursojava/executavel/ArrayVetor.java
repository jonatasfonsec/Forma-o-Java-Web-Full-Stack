package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos tbm*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		
		
		/*Array sempre deve ter uma quantidade de posi��es definidas*/
		/*Sempre deve ser instanciado*/
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		
		
		
		
		/*Atribuir valor nas posi��es do Array*/
		
		for (int pos = 0; pos < notas.length;pos++) {
			
				System.out.println("Nota " + (pos+1) + " � = " + notas[pos]);
			
		}
		
		
		//double [] notas;
		
		
	}
	
}
