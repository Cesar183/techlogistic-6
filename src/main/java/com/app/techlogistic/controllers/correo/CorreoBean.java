/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.controllers.correo;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "correoBean")
@RequestScoped
public class CorreoBean {
    ConfiguracionCorreo configuracion;
    private String asunto;
    private String mensaje;
    private Map<String, Boolean> destinatariosSeleccionados = new HashMap<>();

    public Map<String, Boolean> getDestinatariosSeleccionados() {
        return destinatariosSeleccionados;
    }

    public void setDestinatariosSeleccionados(Map<String, Boolean> destinatariosSeleccionados) {
        this.destinatariosSeleccionados = destinatariosSeleccionados;
    }

    public CorreoBean() {

    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void actualizarDestinatarios() {
    }

    public String enviarCorreo() {
        actualizarDestinatarios();

        configuracion = new ConfiguracionCorreo();
        Properties props = new Properties();
        props.put("mail.smtp.host", configuracion.getSmtpHost());
        props.put("mail.smtp.port", configuracion.getSmtpPort());
        props.put("mail.smtp.auth", configuracion.isSmtpAuth());
        props.put("mail.smtp.starttls.enable", configuracion.isStartTlsEnabled());
        props.put("mail.smtp.ssl.trust", configuracion.getSmtpHost());
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        configuracion.getSmtpUser(),
                        configuracion.getSmtpPassword()
                );
            }
        });

        try {
            for (Map.Entry<String, Boolean> entry : destinatariosSeleccionados.entrySet()) {
                String correo = entry.getKey();
                boolean seleccionado = entry.getValue();
                if (seleccionado) {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(configuracion.getSmtpUser()));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(String.join(";", correo)));
                    message.setSubject(asunto);
                    message.setText(mensaje);
                    Transport.send(message);
                }
            }
            destinatariosSeleccionados.clear();
            asunto = "";
            mensaje = "";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correo enviado exitosamente", null));
        } catch (MessagingException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al enviar el correo", null));
        }
        return null;
    }
}
