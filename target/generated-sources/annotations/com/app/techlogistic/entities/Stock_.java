package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-04T21:16:30")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Integer> idStock;
    public static volatile SingularAttribute<Stock, String> estado;
    public static volatile SingularAttribute<Stock, Integer> cantidadStock;
    public static volatile SingularAttribute<Stock, Producto> codigoProducto;
    public static volatile SingularAttribute<Stock, String> descripcionStock;

}