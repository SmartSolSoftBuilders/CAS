package com.generalseguros.comun;

import java.io.Serializable;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.generalseguros.db.CommonDB;
import com.generalseguros.db.PropertyType;

/**
 * 
 * Clase que se encarga de administrar los correos electronicos
 * 
 * @author Smart Solutions
 * 
 */
public class SSOMailer implements Serializable {

	public static String MAIL_SMTP_HOST = CommonDB.getPropertyValue(
			"mail.smtp.host", PropertyType.COMMON);
	public static String MAIL_SMTP_PORT = CommonDB.getPropertyValue(
			"mail.smtp.port", PropertyType.COMMON);
	public static String MAIL_DEBUG = CommonDB.getPropertyValue("mail.debug",
			PropertyType.COMMON);
	public static String MAIL_SMTP_AUTH = CommonDB.getPropertyValue(
			"mail.smtp.auth", PropertyType.COMMON);
	public static String MAIL_SMTP_STARTTLS_ENABLE = CommonDB.getPropertyValue(
			"mail.smtp.starttls.enable", PropertyType.COMMON);
	public static String MAIL_FROM = CommonDB.getPropertyValue("mail.from",
			PropertyType.COMMON);
	public static String MAIL_PASSWORD = CommonDB.getPropertyValue(
			"mail.password", PropertyType.COMMON);
	public static String MAIL_SUBJECT = CommonDB.getPropertyValue(
			"mail.subject", PropertyType.COMMON);
	public static String MAIL_USERNAME = CommonDB.getPropertyValue(
			"mail.username", PropertyType.COMMON);
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5906127531326421483L;

	/**
	 * Se encarga de enviar correos de acuerdo a los datos recibidos.
	 * 
	 * @param destinatario
	 * @param asunto
	 * @param mensaje
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	public void enviarCorreo(String destinatario, String asunto, String mensaje) throws AddressException, MessagingException {
		Properties props = new Properties();
		props.put("mail.smtp.auth", MAIL_SMTP_AUTH);
		props.put("mail.smtp.starttls.enable", MAIL_SMTP_STARTTLS_ENABLE);
		props.put("mail.smtp.host", MAIL_SMTP_HOST);
		props.put("mail.smtp.port", MAIL_SMTP_PORT);

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(MAIL_USERNAME,
								MAIL_PASSWORD);
					}
				});

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(MAIL_FROM));
		message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(destinatario));
		message.setSubject(asunto);
		message.setText(mensaje);

		Transport.send(message);
	}

	/**
	 * Se encarga de enviar correos de acuerdo a los datos recibidos. Enviando
	 * el asunto configurado en Common.Properties mail.subject
	 * 
	 * @param destinatario
	 * @param mensaje
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	public void enviarCorreo(String destinatario, String mensaje) throws AddressException, MessagingException {
		this.enviarCorreo(destinatario, MAIL_SUBJECT, mensaje);
	}

}
