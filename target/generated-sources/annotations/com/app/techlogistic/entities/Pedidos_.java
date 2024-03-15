package com.app.techlogistic.entities;

import com.app.techlogistic.entities.MateriaPrima;
import com.app.techlogistic.entities.Proveedores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Integer> numeroOrden;
    public static volatile SingularAttribute<Pedidos, Proveedores> idProveedor;
    public static volatile SingularAttribute<Pedidos, Integer> cantidadPedido;
    public static volatile SingularAttribute<Pedidos, Date> fechaPedido;
    public static volatile SingularAttribute<Pedidos, MateriaPrima> idMateriaPrima;
    public static volatile SingularAttribute<Pedidos, Integer> idPedido;

}