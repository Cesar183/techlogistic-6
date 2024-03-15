/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.app.techlogistic.controllers.graficos;

import com.app.techlogistic.controllers.FuncionarioFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.primefaces.model.chart.PieChartModel;

@Named(value = "graficoDinamico")
@ViewScoped
public class GraficoDinamico implements Serializable {

    Compra compra;
    @EJB
    FuncionarioFacade ffl;
    List<Compra> listado;
    PieChartModel torta;
    
    public GraficoDinamico() {
        try {
            torta = new PieChartModel();
            for(Compra item : this.ffl.obtenerDatos()){
                torta.set(item.getNombre(), item.getSumatoria());
                //System.out.println("nombre: " + item.getNombre() + "suma: " + item.getSumatoria());
            }
            torta.setTitle("Ventas por mes");
            torta.setLegendPosition("e");
            //torta.setFill(true);
            torta.setShowDataLabels(true);
            torta.setDiameter(400);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public List<Compra> getListado() {
        return listado;
    }

    public void setListado(List<Compra> listado) {
        this.listado = listado;
    }

    public PieChartModel getTorta() {
        return torta;
    }

    public void setTorta(PieChartModel torta) {
        this.torta = torta;
    }
    
    @PostConstruct
    public void init(){   
        torta = new PieChartModel();
        for(Compra item : this.ffl.obtenerDatos()){
            torta.set(item.getNombre(), item.getSumatoria());
            System.out.println("nombre: " + item.getNombre() + "suma: " + item.getSumatoria());
        }
        torta.setTitle("Compras por mes");
        torta.setLegendPosition("e");
        torta.setFill(true);
        torta.setShowDataLabels(true);
        torta.setDiameter(400);
    }
    
}
