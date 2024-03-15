/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "materia_prima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriaPrima.findAll", query = "SELECT m FROM MateriaPrima m"),
    @NamedQuery(name = "MateriaPrima.findByIdMateriaPrima", query = "SELECT m FROM MateriaPrima m WHERE m.idMateriaPrima = :idMateriaPrima"),
    @NamedQuery(name = "MateriaPrima.findByColorMateria", query = "SELECT m FROM MateriaPrima m WHERE m.colorMateria = :colorMateria"),
    @NamedQuery(name = "MateriaPrima.findByTextura", query = "SELECT m FROM MateriaPrima m WHERE m.textura = :textura"),
    @NamedQuery(name = "MateriaPrima.findByPrecio", query = "SELECT m FROM MateriaPrima m WHERE m.precio = :precio"),
    @NamedQuery(name = "MateriaPrima.findByCantidadMateria", query = "SELECT m FROM MateriaPrima m WHERE m.cantidadMateria = :cantidadMateria"),
    @NamedQuery(name = "MateriaPrima.findByPeso", query = "SELECT m FROM MateriaPrima m WHERE m.peso = :peso"),
    @NamedQuery(name = "MateriaPrima.findByDescripcionMateria", query = "SELECT m FROM MateriaPrima m WHERE m.descripcionMateria = :descripcionMateria")})
public class MateriaPrima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_materia_prima")
    private Integer idMateriaPrima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "color_materia")
    private String colorMateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "textura")
    private String textura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private float precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_materia")
    private int cantidadMateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private float peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "descripcion_materia")
    private String descripcionMateria;
    @JoinColumn(name = "categoria_materia_id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaMateria categoriaMateriaIdCategoria;
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id_funcionario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Funcionario idFuncionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateriaPrima", fetch = FetchType.LAZY)
    private List<ProveedorMateria> proveedorMateriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateriaPrima", fetch = FetchType.LAZY)
    private List<MateriaProducto> materiaProductoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateriaPrima", fetch = FetchType.LAZY)
    private List<Pedidos> pedidosList;

    public MateriaPrima() {
    }

    public MateriaPrima(Integer idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public MateriaPrima(Integer idMateriaPrima, String colorMateria, String textura, float precio, int cantidadMateria, float peso, String descripcionMateria) {
        this.idMateriaPrima = idMateriaPrima;
        this.colorMateria = colorMateria;
        this.textura = textura;
        this.precio = precio;
        this.cantidadMateria = cantidadMateria;
        this.peso = peso;
        this.descripcionMateria = descripcionMateria;
    }

    public Integer getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(Integer idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public String getColorMateria() {
        return colorMateria;
    }

    public void setColorMateria(String colorMateria) {
        this.colorMateria = colorMateria;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidadMateria() {
        return cantidadMateria;
    }

    public void setCantidadMateria(int cantidadMateria) {
        this.cantidadMateria = cantidadMateria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDescripcionMateria() {
        return descripcionMateria;
    }

    public void setDescripcionMateria(String descripcionMateria) {
        this.descripcionMateria = descripcionMateria;
    }

    public CategoriaMateria getCategoriaMateriaIdCategoria() {
        return categoriaMateriaIdCategoria;
    }

    public void setCategoriaMateriaIdCategoria(CategoriaMateria categoriaMateriaIdCategoria) {
        this.categoriaMateriaIdCategoria = categoriaMateriaIdCategoria;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @XmlTransient
    public List<ProveedorMateria> getProveedorMateriaList() {
        return proveedorMateriaList;
    }

    public void setProveedorMateriaList(List<ProveedorMateria> proveedorMateriaList) {
        this.proveedorMateriaList = proveedorMateriaList;
    }

    @XmlTransient
    public List<MateriaProducto> getMateriaProductoList() {
        return materiaProductoList;
    }

    public void setMateriaProductoList(List<MateriaProducto> materiaProductoList) {
        this.materiaProductoList = materiaProductoList;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriaPrima != null ? idMateriaPrima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaPrima)) {
            return false;
        }
        MateriaPrima other = (MateriaPrima) object;
        if ((this.idMateriaPrima == null && other.idMateriaPrima != null) || (this.idMateriaPrima != null && !this.idMateriaPrima.equals(other.idMateriaPrima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.MateriaPrima[ idMateriaPrima=" + idMateriaPrima + " ]";
    }
    
}
