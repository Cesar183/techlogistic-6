package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Cliente;
import com.app.techlogistic.entities.Funcionario;
import com.app.techlogistic.entities.MedioPago;
import com.app.techlogistic.entities.OrdenVentaProducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(OrdenVenta.class)
public class OrdenVenta_ { 

    public static volatile SingularAttribute<OrdenVenta, Cliente> idCliente;
    public static volatile ListAttribute<OrdenVenta, OrdenVentaProducto> ordenVentaProductoList;
    public static volatile SingularAttribute<OrdenVenta, Integer> cantidadProductos;
    public static volatile SingularAttribute<OrdenVenta, Float> descuento;
    public static volatile SingularAttribute<OrdenVenta, Float> subtotal;
    public static volatile SingularAttribute<OrdenVenta, Integer> numeroOrdenVenta;
    public static volatile SingularAttribute<OrdenVenta, Date> fechaFactura;
    public static volatile SingularAttribute<OrdenVenta, Float> valorTotal;
    public static volatile SingularAttribute<OrdenVenta, MedioPago> idMedioPago;
    public static volatile SingularAttribute<OrdenVenta, Funcionario> idFuncionario;
    public static volatile SingularAttribute<OrdenVenta, String> observacion;

}