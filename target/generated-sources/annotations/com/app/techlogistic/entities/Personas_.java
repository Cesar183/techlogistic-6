package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Cliente;
import com.app.techlogistic.entities.Correos;
import com.app.techlogistic.entities.Direcciones;
import com.app.techlogistic.entities.Funcionario;
import com.app.techlogistic.entities.Proveedores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-15T15:55:43")
@StaticMetamodel(Personas.class)
public class Personas_ { 

    public static volatile ListAttribute<Personas, Cliente> clienteList;
    public static volatile SingularAttribute<Personas, String> segundoNombre;
    public static volatile ListAttribute<Personas, Funcionario> funcionarioList;
    public static volatile SingularAttribute<Personas, String> primerNombre;
    public static volatile SingularAttribute<Personas, String> primerApellido;
    public static volatile ListAttribute<Personas, Proveedores> proveedoresList;
    public static volatile SingularAttribute<Personas, String> segundoApellido;
    public static volatile ListAttribute<Personas, Direcciones> direccionesList;
    public static volatile ListAttribute<Personas, Correos> correosList;
    public static volatile SingularAttribute<Personas, Integer> idPersona;
    public static volatile SingularAttribute<Personas, String> noDocumento;

}