package br.com.rodrigopereira.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.rodrigopereira.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
