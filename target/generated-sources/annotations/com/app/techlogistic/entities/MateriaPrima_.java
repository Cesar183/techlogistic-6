package com.app.techlogistic.entities;

import com.app.techlogistic.entities.CategoriaMateria;
import com.app.techlogistic.entities.Funcionario;
import com.app.techlogistic.entities.MateriaProducto;
import com.app.techlogistic.entities.Pedidos;
import com.app.techlogistic.entities.ProveedorMateria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-02T23:17:00")
@StaticMetamodel(MateriaPrima.class)
public class MateriaPrima_ { 

    public static volatile SingularAttribute<MateriaPrima, String> colorMateria;
    public static volatile SingularAttribute<MateriaPrima, CategoriaMateria> categoriaMateriaIdCategoria;
    public static volatile SingularAttribute<MateriaPrima, Float> precio;
    public static volatile SingularAttribute<MateriaPrima, Float> peso;
    public static volatile SingularAttribute<MateriaPrima, String> descripcionMateria;
    public static volatile SingularAttribute<MateriaPrima, String> textura;
    public static volatile SingularAttribute<MateriaPrima, Integer> idMateriaPrima;
    public static volatile SingularAttribute<MateriaPrima, Integer> cantidadMateria;
    public static volatile SingularAttribute<MateriaPrima, Funcionario> idFuncionario;
    public static volatile ListAttribute<MateriaPrima, Pedidos> pedidosList;
    public static volatile ListAttribute<MateriaPrima, ProveedorMateria> proveedorMateriaList;
    public static volatile ListAttribute<MateriaPrima, MateriaProducto> materiaProductoList;

}