/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.controllers;

import com.app.techlogistic.entities.OrdenVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cesar
 */
@Stateless
public class OrdenVentaFacade extends AbstractFacade<OrdenVenta> {

    @PersistenceContext(unitName = "com.app_techlogistic_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenVentaFacade() {
        super(OrdenVenta.class);
    }
    
}
