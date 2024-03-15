/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "cotizaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciones.findAll", query = "SELECT c FROM Cotizaciones c"),
    @NamedQuery(name = "Cotizaciones.findByCodigoCotizacion", query = "SELECT c FROM Cotizaciones c WHERE c.codigoCotizacion = :codigoCotizacion"),
    @NamedQuery(name = "Cotizaciones.findByTipoCotizacion", query = "SELECT c FROM Cotizaciones c WHERE c.tipoCotizacion = :tipoCotizacion"),
    @NamedQuery(name = "Cotizaciones.findByValorUnitario", query = "SELECT c FROM Cotizaciones c WHERE c.valorUnitario = :valorUnitario"),
    @NamedQuery(name = "Cotizaciones.findByFechaCotizacion", query = "SELECT c FROM Cotizaciones c WHERE c.fechaCotizacion = :fechaCotizacion"),
    @NamedQuery(name = "Cotizaciones.findByCantidadProducto", query = "SELECT c FROM Cotizaciones c WHERE c.cantidadProducto = :cantidadProducto"),
    @NamedQuery(name = "Cotizaciones.findByValorTotalCot", query = "SELECT c FROM Cotizaciones c WHERE c.valorTotalCot = :valorTotalCot")})
public class Cotizaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_cotizacion")
    private Integer codigoCotizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipo_cotizacion")
    private String tipoCotizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_unitario")
    private float valorUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cotizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCotizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_producto")
    private int cantidadProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_total_cot")
    private float valorTotalCot;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente idCliente;
    @JoinColumn(name = "codigo_producto", referencedColumnName = "codigo_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto codigoProducto;

    public Cotizaciones() {
    }

    public Cotizaciones(Integer codigoCotizacion) {
        this.codigoCotizacion = codigoCotizacion;
    }

    public Cotizaciones(Integer codigoCotizacion, String tipoCotizacion, float valorUnitario, Date fechaCotizacion, int cantidadProducto, float valorTotalCot) {
        this.codigoCotizacion = codigoCotizacion;
        this.tipoCotizacion = tipoCotizacion;
        this.valorUnitario = valorUnitario;
        this.fechaCotizacion = fechaCotizacion;
        this.cantidadProducto = cantidadProducto;
        this.valorTotalCot = valorTotalCot;
    }

    public Integer getCodigoCotizacion() {
        return codigoCotizacion;
    }

    public void setCodigoCotizacion(Integer codigoCotizacion) {
        this.codigoCotizacion = codigoCotizacion;
    }

    public String getTipoCotizacion() {
        return tipoCotizacion;
    }

    public void setTipoCotizacion(String tipoCotizacion) {
        this.tipoCotizacion = tipoCotizacion;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Date getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(Date fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public float getValorTotalCot() {
        return valorTotalCot;
    }

    public void setValorTotalCot(float valorTotalCot) {
        this.valorTotalCot = valorTotalCot;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        hash += (codigoCotizacion != null ? codigoCotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciones)) {
            return false;
        }
        Cotizaciones other = (Cotizaciones) object;
        if ((this.codigoCotizacion == null && other.codigoCotizacion != null) || (this.codigoCotizacion != null && !this.codigoCotizacion.equals(other.codigoCotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.Cotizaciones[ codigoCotizacion=" + codigoCotizacion + " ]";
    }
    
}
