/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "materia_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriaProducto.findAll", query = "SELECT m FROM MateriaProducto m"),
    @NamedQuery(name = "MateriaProducto.findByIdMateriaProducto", query = "SELECT m FROM MateriaProducto m WHERE m.idMateriaProducto = :idMateriaProducto"),
    @NamedQuery(name = "MateriaProducto.findByGastoMateriaPrima", query = "SELECT m FROM MateriaProducto m WHERE m.gastoMateriaPrima = :gastoMateriaPrima")})
public class MateriaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia_producto")
    private Integer idMateriaProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gasto_materia_prima")
    private float gastoMateriaPrima;
    @JoinColumn(name = "id_materia_prima", referencedColumnName = "id_materia_prima")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MateriaPrima idMateriaPrima;
    @JoinColumn(name = "codigo_producto", referencedColumnName = "codigo_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto codigoProducto;

    public MateriaProducto() {
    }

    public MateriaProducto(Integer idMateriaProducto) {
        this.idMateriaProducto = idMateriaProducto;
    }

    public MateriaProducto(Integer idMateriaProducto, float gastoMateriaPrima) {
        this.idMateriaProducto = idMateriaProducto;
        this.gastoMateriaPrima = gastoMateriaPrima;
    }

    public Integer getIdMateriaProducto() {
        return idMateriaProducto;
    }

    public void setIdMateriaProducto(Integer idMateriaProducto) {
        this.idMateriaProducto = idMateriaProducto;
    }

    public float getGastoMateriaPrima() {
        return gastoMateriaPrima;
    }

    public void setGastoMateriaPrima(float gastoMateriaPrima) {
        this.gastoMateriaPrima = gastoMateriaPrima;
    }

    public MateriaPrima getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(MateriaPrima idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriaProducto != null ? idMateriaProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaProducto)) {
            return false;
        }
        MateriaProducto other = (MateriaProducto) object;
        if ((this.idMateriaProducto == null && other.idMateriaProducto != null) || (this.idMateriaProducto != null && !this.idMateriaProducto.equals(other.idMateriaProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.MateriaProducto[ idMateriaProducto=" + idMateriaProducto + " ]";
    }
    
}
