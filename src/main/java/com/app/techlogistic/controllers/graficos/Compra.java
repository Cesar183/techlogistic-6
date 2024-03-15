/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.controllers.graficos;

public class Compra {
    private String nombre;
    private Double sumatoria;

    public Compra() {
    }

    public Compra(String nombre, Double sumatoria) {
        this.nombre = nombre;
        this.sumatoria = sumatoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(Double sumatoria) {
        this.sumatoria = sumatoria;
    }
    
}
