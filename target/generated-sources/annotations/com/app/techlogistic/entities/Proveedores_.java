package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Pedidos;
import com.app.techlogistic.entities.Personas;
import com.app.techlogistic.entities.ProveedorMateria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, Integer> razonSocial;
    public static volatile SingularAttribute<Proveedores, Integer> idProveedor;
    public static volatile SingularAttribute<Proveedores, String> nit;
    public static volatile ListAttribute<Proveedores, Pedidos> pedidosList;
    public static volatile ListAttribute<Proveedores, ProveedorMateria> proveedorMateriaList;
    public static volatile SingularAttribute<Proveedores, Personas> idPersona;

}