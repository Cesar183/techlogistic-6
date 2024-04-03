package com.app.techlogistic.entities;

import com.app.techlogistic.entities.MateriaPrima;
import com.app.techlogistic.entities.Proveedores;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-02T23:17:00")
@StaticMetamodel(ProveedorMateria.class)
public class ProveedorMateria_ { 

    public static volatile SingularAttribute<ProveedorMateria, Integer> idProveedorMateria;
    public static volatile SingularAttribute<ProveedorMateria, Proveedores> idProveedor;
    public static volatile SingularAttribute<ProveedorMateria, MateriaPrima> idMateriaPrima;

}