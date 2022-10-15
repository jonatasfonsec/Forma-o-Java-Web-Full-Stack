package enviando.email;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testeEmail() throws Exception {
		
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("<h2>Você está recebendo acesso de curso de Java</h2> <br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo <br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://www.uol.com.br\">Acessar/</a>");
		
		
		
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("jonatas.fonsec@gmail.com", "jonatas.fonsec@outlook.com",
				"TestandoEnviaEmail",stringBuilderTextoEmail.toString());
		
		//enviaEmail.enviarEmail(true);
		enviaEmail.enviarEmailAnexo(true);
	}
}
