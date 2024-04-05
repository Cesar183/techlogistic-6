package com.app.techlogistic.entities;

import com.app.techlogistic.entities.OrdenVenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-04T21:16:30")
@StaticMetamodel(MedioPago.class)
public class MedioPago_ { 

    public static volatile SingularAttribute<MedioPago, Integer> idMedioPago;
    public static volatile SingularAttribute<MedioPago, String> descripcionPago;
    public static volatile ListAttribute<MedioPago, OrdenVenta> ordenVentaList;

}