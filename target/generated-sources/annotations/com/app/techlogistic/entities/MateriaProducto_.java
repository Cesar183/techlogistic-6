package com.app.techlogistic.entities;

import com.app.techlogistic.entities.MateriaPrima;
import com.app.techlogistic.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(MateriaProducto.class)
public class MateriaProducto_ { 

    public static volatile SingularAttribute<MateriaProducto, Integer> idMateriaProducto;
    public static volatile SingularAttribute<MateriaProducto, Float> gastoMateriaPrima;
    public static volatile SingularAttribute<MateriaProducto, MateriaPrima> idMateriaPrima;
    public static volatile SingularAttribute<MateriaProducto, Producto> codigoProducto;

}