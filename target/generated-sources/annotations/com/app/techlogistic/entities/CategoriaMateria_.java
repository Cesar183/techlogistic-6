package com.app.techlogistic.entities;

import com.app.techlogistic.entities.MateriaPrima;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-02T23:17:00")
@StaticMetamodel(CategoriaMateria.class)
public class CategoriaMateria_ { 

    public static volatile SingularAttribute<CategoriaMateria, String> descripcion;
    public static volatile ListAttribute<CategoriaMateria, MateriaPrima> materiaPrimaList;
    public static volatile SingularAttribute<CategoriaMateria, Integer> idCategoria;

}