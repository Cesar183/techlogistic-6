/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.app.techlogistic.controllers.correo;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validarPassword")
public class ValidarPassword implements Validator {

    FacesMessage fm;
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object valor) throws ValidatorException {
        if (valor == null) {
            return;
        }
        if (!String.valueOf(valor).matches(PASSWORD_PATTERN)) {
            fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "La contraseña debe tener al menos 8 caracteres, incluyendo letras mayúsculas, minúsculas, números y caracteres especiales", "MSG_ERROR");
            throw new ValidatorException(fm);
        }
    }
    
}
