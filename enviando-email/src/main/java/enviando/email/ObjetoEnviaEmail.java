package enviando.email;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ObjetoEnviaEmail {

	private String userName = "jonatas.fonsec@outlook.com";
	private String senha = "gangrel86";
	
	private String listaDestinatarios = "";
	private String nomeRemetente = "";
	private String assuntoEmail = "";
	private String textoEmail = "";
	
	public ObjetoEnviaEmail(String listaDestinatarios, String nomeRemetente,
			String assuntoEmail, String textoEmail) {
			this.listaDestinatarios = listaDestinatarios;
			this.nomeRemetente = nomeRemetente;
			this.assuntoEmail = assuntoEmail;
			this.textoEmail = textoEmail;
	}
	

	public void enviarEmail(boolean envioHtml) throws Exception {

		/* Olhe as configurações de smtp */
		//
		// j.jonatas.abreu@bol.com.br
		// J12345678

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/* Autorização */
		properties.put("mail.smtp.starttls.enable", "true");/* Autenticação */
		properties.put("mail.smtp.host", "smtp-mail.outlook.com"); /* Servidor Gmail */
		properties.put("mail.smtp.port", "587");/* porta do servidor */
		properties.put("mail.smtp.socketFactory.port", "587");/* Porta conectada pelo Socket */
		properties.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");/* Classe Socket de conexão ao SMTP */

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}

		});

		// System.out.println(session);

		Address[] toUser = InternetAddress.parse(listaDestinatarios);

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(nomeRemetente)); /* Quem esta enviando */
		message.setRecipients(Message.RecipientType.TO, toUser);/* Emails de destinatarios */
		message.setSubject(assuntoEmail);/* Assunto do email */
		
		if(envioHtml) {
			message.setContent(textoEmail, "text/html; charset=UTF-8");
		}else {
		
		message.setText(textoEmail);
		}
		Transport.send(message);

		System.out.println("Mensagem enviada!");

	}
	
	public void enviarEmailAnexo(boolean envioHtml) throws Exception {

		/* Olhe as configurações de smtp */
		//
		// j.jonatas.abreu@bol.com.br
		// J12345678

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/* Autorização */
		properties.put("mail.smtp.starttls.enable", "true");/* Autenticação */
		properties.put("mail.smtp.host", "smtp-mail.outlook.com"); /* Servidor Gmail */
		properties.put("mail.smtp.port", "587");/* porta do servidor */
		properties.put("mail.smtp.socketFactory.port", "587");/* Porta conectada pelo Socket */
		properties.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");/* Classe Socket de conexão ao SMTP */

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}

		});

		// System.out.println(session);

		Address[] toUser = InternetAddress.parse(listaDestinatarios);

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(nomeRemetente)); /* Quem esta enviando */
		message.setRecipients(Message.RecipientType.TO, toUser);/* Emails de destinatarios */
		message.setSubject(assuntoEmail);/* Assunto do email */
		
		/*Parte 1 do email: Texto e descrição do email*/
		
		MimeBodyPart corpoEmail = new MimeBodyPart();
		
		
		
		if(envioHtml) {
			corpoEmail.setContent(textoEmail, "text/html; charset=UTF-8");
		}else {
		
			corpoEmail.setText(textoEmail);
		}
		
		/*Parte 2 do email: anexo*/
		MimeBodyPart anexoEmail = new MimeBodyPart();
		anexoEmail.setDataHandler(new DataHandler(new ByteArrayDataSource(simuladorDePDF(),"application/pdf")));
		anexoEmail.setFileName("anexoemail.pdf");
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(corpoEmail);
		multipart.addBodyPart(anexoEmail);
		message.setContent(multipart);
		
		Transport.send(message);

		System.out.println("Mensagem com anexo enviada!");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Esse método simula o pdf ou qualquer arquivo anexado no email.
	 */
	
	private FileInputStream simuladorDePDF() throws Exception{
		
		Document document = new Document();
		File file = new File("Jonatas.pdf");
		file.createNewFile();
		PdfWriter.getInstance(document, new FileOutputStream(file));
		document.open();
		document.add(new Paragraph("Lorem ipsum potenti vitae fusce magna sit praesent auctor, placerat sed eget a est vel laoreet ad, aliquet at gravida blandit maecenas primis sociosqu. conubia quisque condimentum eget aenean pharetra laoreet commodo libero aliquet pellentesque dictum fames metus, curabitur tellus suspendisse cubilia neque litora congue curabitur elit tortor nostra litora. tellus accumsan vitae varius quisque ante scelerisque nostra volutpat vulputate platea non, dictumst suscipit scelerisque pretium viverra aenean sem consequat metus nam. congue accumsan sollicitudin lobortis rutrum tempus potenti eleifend tristique per pellentesque odio, aenean litora elementum neque sodales sem duis eget inceptos cursus, metus ad suspendisse nisl sapien pharetra sed duis elementum dapibus. \r\n"
				+ "\r\n"
				+ "	Congue litora placerat accumsan vel primis semper diam tincidunt torquent, neque nisi fermentum dapibus nibh lobortis tristique felis. ornare vivamus viverra consectetur non auctor quam, torquent auctor sed curae netus bibendum ad, curae suscipit sagittis dictumst senectus. volutpat tempus quis erat mollis auctor primis ipsum, commodo tellus vulputate hendrerit justo nec, morbi himenaeos porta cubilia habitant est. metus viverra amet netus ac mattis amet nunc non erat, himenaeos platea ultricies ac dapibus faucibus cursus vel per ante, condimentum nisi rutrum litora quis consectetur justo orci. aenean vulputate primis ultricies posuere netus sollicitudin duis hendrerit praesent, integer elit erat urna semper dictumst tincidunt facilisis. \r\n"
				+ "\r\n"
				+ "	Pretium nullam placerat blandit vulputate egestas dictum elit himenaeos, libero consequat porta ultricies amet elit fermentum leo, dolor lectus sociosqu cubilia metus accumsan interdum. arcu congue vel cubilia phasellus habitant aliquam blandit lacus luctus, maecenas hac aenean condimentum diam aenean suspendisse. vitae maecenas leo turpis libero congue proin phasellus sociosqu nibh nunc imperdiet orci elit inceptos mi, adipiscing vestibulum lorem non aliquam nullam odio erat torquent non placerat suscipit lectus. ultrices praesent laoreet neque adipiscing torquent morbi et, inceptos adipiscing fusce ligula sapien potenti venenatis proin, suscipit neque suscipit eros odio a. \r\n"
				+ "\r\n"
				+ "	Adipiscing curabitur urna fringilla justo tincidunt nisl quisque odio, inceptos pellentesque sem at nibh ut tristique justo, aliquam venenatis donec elit varius habitasse primis. id aliquam felis auctor porttitor odio mauris luctus auctor placerat, lacinia senectus curabitur tincidunt elementum molestie dolor quisque non id, potenti lectus neque lobortis accumsan non luctus eros. ante platea scelerisque bibendum malesuada potenti ornare suscipit convallis etiam, sagittis scelerisque cras platea volutpat ac pharetra enim ullamcorper, imperdiet phasellus tincidunt nullam accumsan litora molestie aptent. primis id primis vulputate inceptos porta vel ante lacinia, senectus commodo cubilia sodales pharetra leo pellentesque aliquam, curabitur egestas volutpat erat luctus interdum ultricies. \r\n"
				+ "\r\n"
				+ "	Tellus faucibus tincidunt eget aliquet malesuada sagittis class facilisis, amet aliquam lacinia conubia tempus convallis dictum. dictumst donec congue suscipit sagittis iaculis aliquet fringilla ullamcorper, taciti aenean donec urna gravida curabitur proin, netus accumsan scelerisque in commodo auctor nisl. hendrerit diam eleifend proin massa est suspendisse commodo aliquam a, orci magna velit lacinia consectetur cursus id scelerisque conubia, enim ut volutpat nulla id litora ultricies taciti. viverra consectetur litora taciti mollis senectus mauris placerat quam, dapibus nisl imperdiet eget at eleifend potenti eu, nulla auctor donec fames lacinia mattis libero et, vulputate tempor ante vivamus nostra erat ligula. "));
		document.close();
		
		return new FileInputStream(file);
		
	}
	
	
	
	

}
