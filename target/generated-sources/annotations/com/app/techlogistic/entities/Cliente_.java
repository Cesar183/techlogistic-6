package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Cotizaciones;
import com.app.techlogistic.entities.OrdenVenta;
import com.app.techlogistic.entities.Personas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> estadoCliente;
    public static volatile SingularAttribute<Cliente, String> tipoCliente;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> genero;
    public static volatile SingularAttribute<Cliente, Float> medidas;
    public static volatile ListAttribute<Cliente, Cotizaciones> cotizacionesList;
    public static volatile SingularAttribute<Cliente, Personas> idPersona;
    public static volatile ListAttribute<Cliente, OrdenVenta> ordenVentaList;

}