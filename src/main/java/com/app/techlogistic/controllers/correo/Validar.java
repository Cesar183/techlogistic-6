/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.controllers.correo;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("varlidarCorreo")
public class Validar implements Validator{
    FacesMessage fm;

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object valor) throws ValidatorException {
        if (valor == null) {
            return;
        }

        String valorStr = String.valueOf(valor);
        if (valorStr != "@") {
            fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "El correo debe contener el símbolo '@'", null);
            throw new ValidatorException(fm);
        }
    }
}
