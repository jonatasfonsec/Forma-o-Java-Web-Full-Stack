package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Erro no Processamento do arquivo de nota"+erro);
	}

}
