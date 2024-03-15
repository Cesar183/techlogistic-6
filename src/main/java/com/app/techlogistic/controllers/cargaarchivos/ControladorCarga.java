/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.app.techlogistic.controllers.cargaarchivos;

import com.app.techlogistic.controllers.PersonasFacade;
import com.app.techlogistic.entities.Personas;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.model.file.UploadedFile;


@Named(value = "controladorCarga")
@ViewScoped
public class ControladorCarga implements Serializable {
    private Personas person;
    @EJB
    private PersonasFacade pfl;
    UploadedFile archivo;
    public ControladorCarga() {
        
    }

    public Personas getPerson() {
        return person;
    }

    public void setPerson(Personas person) {
        this.person = person;
    }

    public UploadedFile getArchivo() {
        return archivo;
    }

    public void setArchivo(UploadedFile archivo) {
        this.archivo = archivo;
    }
    @PostConstruct
    public void init(){
        person = new Personas();
    }
    public void cargarArchivo(){
        FacesContext contexto = FacesContext.getCurrentInstance();
        FacesMessage fm = null;
        if(archivo.getSize() > 1){
            try {
                InputStream info = archivo.getInputStream();
                XSSFWorkbook libro = new XSSFWorkbook(info);
                Sheet hoja = libro.getSheetAt(0);
                for(Row fila : hoja){
                    if(fila.getCell(0) != null){
                        person.setNoDocumento(fila.getCell(0).getStringCellValue());
                        person.setPrimerNombre(fila.getCell(1).getStringCellValue());
                        person.setSegundoNombre(fila.getCell(2).getStringCellValue());
                        person.setPrimerApellido(fila.getCell(3).getStringCellValue());
                        person.setSegundoApellido(fila.getCell(4).getStringCellValue());
                        pfl.create(person);
                    }else{
                        break;
                    }
                }
                fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "El archivo se cargo correctamente");
            } catch (IOException ex) {
                 fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Error cargando archivo");
            }
        }
        else{
            fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Por favor, seleccione un archivo");
        }
        contexto.addMessage(null, fm);
    }
}
