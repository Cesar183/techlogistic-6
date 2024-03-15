package com.app.techlogistic.entities;

import com.app.techlogistic.entities.MateriaPrima;
import com.app.techlogistic.entities.OrdenVenta;
import com.app.techlogistic.entities.Personas;
import com.app.techlogistic.entities.Producto;
import com.app.techlogistic.entities.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Roles> rolesIdRol;
    public static volatile SingularAttribute<Funcionario, String> horario;
    public static volatile ListAttribute<Funcionario, Producto> productoList;
    public static volatile SingularAttribute<Funcionario, Float> salario;
    public static volatile ListAttribute<Funcionario, MateriaPrima> materiaPrimaList;
    public static volatile SingularAttribute<Funcionario, Integer> idFuncionario;
    public static volatile SingularAttribute<Funcionario, Personas> idPersona;
    public static volatile ListAttribute<Funcionario, OrdenVenta> ordenVentaList;

}