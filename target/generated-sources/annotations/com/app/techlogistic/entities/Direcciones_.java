package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Personas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-04T21:16:30")
@StaticMetamodel(Direcciones.class)
public class Direcciones_ { 

    public static volatile SingularAttribute<Direcciones, Integer> idDireccion;
    public static volatile SingularAttribute<Direcciones, String> barrio;
    public static volatile SingularAttribute<Direcciones, String> ciudad;
    public static volatile SingularAttribute<Direcciones, String> tipoVia;
    public static volatile SingularAttribute<Direcciones, String> prefijo;
    public static volatile SingularAttribute<Direcciones, String> numViaVeneradora;
    public static volatile SingularAttribute<Direcciones, String> numeroVia;
    public static volatile SingularAttribute<Direcciones, String> numeroPlaca;
    public static volatile SingularAttribute<Direcciones, Personas> idPersona;
    public static volatile SingularAttribute<Direcciones, String> prefijoViaGeneradora;

}