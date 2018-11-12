package br.com.healthtrack.bo;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.healthtrack.dbexception.EmailException;

public class EmailBO {
	
	//EDITAR PARA ENVIAR EMAIL A MENSAGEM NO CONTATO!
	
	
	public void enviarEmail(String destinatario, String assunto, String mensagem) throws EmailException{
	
	final String username = "email@gmail.com"; //put your email here
	final String password = "password"; //put your password here
	
	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smpt.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587"); //587?
	
	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(username, password);
		}
	});
		
		try {
			Message email = new MimeMessage(session);
			email.setFrom(new InternetAddress(username));
			email.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
			email.setSubject(assunto);
			email.setText(mensagem);
			
			Transport.send(email);
			
		} catch(MessagingException e) {
			throw new EmailException("Erro ao enviar o email");
		}
	
	}
}
