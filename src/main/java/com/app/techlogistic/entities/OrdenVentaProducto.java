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
@Table(name = "orden_venta_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenVentaProducto.findAll", query = "SELECT o FROM OrdenVentaProducto o"),
    @NamedQuery(name = "OrdenVentaProducto.findByIdFacturaProducto", query = "SELECT o FROM OrdenVentaProducto o WHERE o.idFacturaProducto = :idFacturaProducto")})
public class OrdenVentaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_factura_producto")
    private Integer idFacturaProducto;
    @JoinColumn(name = "numero_orden_venta", referencedColumnName = "numero_orden_venta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrdenVenta numeroOrdenVenta;
    @JoinColumn(name = "codigo_producto", referencedColumnName = "codigo_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto codigoProducto;

    public OrdenVentaProducto() {
    }

    public OrdenVentaProducto(Integer idFacturaProducto) {
        this.idFacturaProducto = idFacturaProducto;
    }

    public Integer getIdFacturaProducto() {
        return idFacturaProducto;
    }

    public void setIdFacturaProducto(Integer idFacturaProducto) {
        this.idFacturaProducto = idFacturaProducto;
    }

    public OrdenVenta getNumeroOrdenVenta() {
        return numeroOrdenVenta;
    }

    public void setNumeroOrdenVenta(OrdenVenta numeroOrdenVenta) {
        this.numeroOrdenVenta = numeroOrdenVenta;
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
        hash += (idFacturaProducto != null ? idFacturaProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenVentaProducto)) {
            return false;
        }
        OrdenVentaProducto other = (OrdenVentaProducto) object;
        if ((this.idFacturaProducto == null && other.idFacturaProducto != null) || (this.idFacturaProducto != null && !this.idFacturaProducto.equals(other.idFacturaProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.OrdenVentaProducto[ idFacturaProducto=" + idFacturaProducto + " ]";
    }
    
}
