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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "proveedor_materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProveedorMateria.findAll", query = "SELECT p FROM ProveedorMateria p"),
    @NamedQuery(name = "ProveedorMateria.findByIdProveedorMateria", query = "SELECT p FROM ProveedorMateria p WHERE p.idProveedorMateria = :idProveedorMateria")})
public class ProveedorMateria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proveedor_materia")
    private Integer idProveedorMateria;
    @JoinColumn(name = "id_materia_prima", referencedColumnName = "id_materia_prima")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MateriaPrima idMateriaPrima;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proveedores idProveedor;

    public ProveedorMateria() {
    }

    public ProveedorMateria(Integer idProveedorMateria) {
        this.idProveedorMateria = idProveedorMateria;
    }

    public Integer getIdProveedorMateria() {
        return idProveedorMateria;
    }

    public void setIdProveedorMateria(Integer idProveedorMateria) {
        this.idProveedorMateria = idProveedorMateria;
    }

    public MateriaPrima getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(MateriaPrima idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public Proveedores getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedores idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedorMateria != null ? idProveedorMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProveedorMateria)) {
            return false;
        }
        ProveedorMateria other = (ProveedorMateria) object;
        if ((this.idProveedorMateria == null && other.idProveedorMateria != null) || (this.idProveedorMateria != null && !this.idProveedorMateria.equals(other.idProveedorMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.ProveedorMateria[ idProveedorMateria=" + idProveedorMateria + " ]";
    }
    
}
