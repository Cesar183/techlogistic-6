/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.controllers;

import com.app.techlogistic.controllers.graficos.Compra;
import com.app.techlogistic.entities.Funcionario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cesar
 */
@Stateless
public class FuncionarioFacade extends AbstractFacade<Funcionario> {

    @PersistenceContext(unitName = "com.app_techlogistic_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FuncionarioFacade() {
        super(Funcionario.class);
    }
    public List<Compra> obtenerDatos(){
        List<Compra> resultList;
        String jpql = "";
        try {
            jpql = "SELECT NEW com.app.techlogistic.controllers.graficos.Compra(p.material, SUM(p.precio)) FROM Producto p GROUP BY p.material";
            Query query = em.createQuery(jpql, Compra.class);
            resultList = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error: " + jpql + e.getMessage());
            resultList = null;
        }
        return resultList;
    }
}
