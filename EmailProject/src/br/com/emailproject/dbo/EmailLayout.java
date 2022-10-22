package br.com.emailproject.dbo;

public class EmailLayout {

	public Email montarEmailAdministrador(String destinatario,String assunto) {
		
		StringBuilder text = new StringBuilder();
		
		return new Email(destinatario,assunto,text,toString());
	}
}
