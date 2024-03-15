package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Cliente;
import com.app.techlogistic.entities.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(Cotizaciones.class)
public class Cotizaciones_ { 

    public static volatile SingularAttribute<Cotizaciones, Date> fechaCotizacion;
    public static volatile SingularAttribute<Cotizaciones, Cliente> idCliente;
    public static volatile SingularAttribute<Cotizaciones, Integer> codigoCotizacion;
    public static volatile SingularAttribute<Cotizaciones, Float> valorTotalCot;
    public static volatile SingularAttribute<Cotizaciones, Producto> codigoProducto;
    public static volatile SingularAttribute<Cotizaciones, Integer> cantidadProducto;
    public static volatile SingularAttribute<Cotizaciones, String> tipoCotizacion;
    public static volatile SingularAttribute<Cotizaciones, Float> valorUnitario;

}