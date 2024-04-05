package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Funcionario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-04T21:16:30")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> idRol;
    public static volatile ListAttribute<Roles, Funcionario> funcionarioList;
    public static volatile SingularAttribute<Roles, String> descripcionRol;

}