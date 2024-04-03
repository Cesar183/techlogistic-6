package com.app.techlogistic.entities;

import com.app.techlogistic.entities.Cotizaciones;
import com.app.techlogistic.entities.Funcionario;
import com.app.techlogistic.entities.MateriaProducto;
import com.app.techlogistic.entities.OrdenVentaProducto;
import com.app.techlogistic.entities.Stock;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-02T23:17:00")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> ubicacion;
    public static volatile SingularAttribute<Producto, String> talla;
    public static volatile ListAttribute<Producto, Stock> stockList;
    public static volatile SingularAttribute<Producto, String> colorProducto;
    public static volatile ListAttribute<Producto, Cotizaciones> cotizacionesList;
    public static volatile SingularAttribute<Producto, Funcionario> idFuncionario;
    public static volatile SingularAttribute<Producto, String> modelo;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, String> material;
    public static volatile ListAttribute<Producto, OrdenVentaProducto> ordenVentaProductoList;
    public static volatile SingularAttribute<Producto, Integer> codigoProducto;
    public static volatile ListAttribute<Producto, MateriaProducto> materiaProductoList;

}