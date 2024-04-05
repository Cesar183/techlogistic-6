package com.app.techlogistic.entities;

import com.app.techlogistic.entities.OrdenVenta;
import com.app.techlogistic.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-04T21:16:30")
@StaticMetamodel(OrdenVentaProducto.class)
public class OrdenVentaProducto_ { 

    public static volatile SingularAttribute<OrdenVentaProducto, OrdenVenta> numeroOrdenVenta;
    public static volatile SingularAttribute<OrdenVentaProducto, Integer> idFacturaProducto;
    public static volatile SingularAttribute<OrdenVentaProducto, Producto> codigoProducto;

}