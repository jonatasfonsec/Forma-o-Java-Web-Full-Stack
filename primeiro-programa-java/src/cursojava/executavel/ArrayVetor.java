package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	/*Usado para executar código*/
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos tbm*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		
		
		/*Array sempre deve ter uma quantidade de posições definidas*/
		/*Sempre deve ser instanciado*/
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		
		
		
		
		/*Atribuir valor nas posições do Array*/
		
		for (int pos = 0; pos < notas.length;pos++) {
			
				System.out.println("Nota " + (pos+1) + " é = " + notas[pos]);
			
		}
		
		
		//double [] notas;
		
		
	}
	
}
