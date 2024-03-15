/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.techlogistic.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "orden_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenVenta.findAll", query = "SELECT o FROM OrdenVenta o"),
    @NamedQuery(name = "OrdenVenta.findByNumeroOrdenVenta", query = "SELECT o FROM OrdenVenta o WHERE o.numeroOrdenVenta = :numeroOrdenVenta"),
    @NamedQuery(name = "OrdenVenta.findByCantidadProductos", query = "SELECT o FROM OrdenVenta o WHERE o.cantidadProductos = :cantidadProductos"),
    @NamedQuery(name = "OrdenVenta.findByDescuento", query = "SELECT o FROM OrdenVenta o WHERE o.descuento = :descuento"),
    @NamedQuery(name = "OrdenVenta.findByFechaFactura", query = "SELECT o FROM OrdenVenta o WHERE o.fechaFactura = :fechaFactura"),
    @NamedQuery(name = "OrdenVenta.findByObservacion", query = "SELECT o FROM OrdenVenta o WHERE o.observacion = :observacion"),
    @NamedQuery(name = "OrdenVenta.findBySubtotal", query = "SELECT o FROM OrdenVenta o WHERE o.subtotal = :subtotal"),
    @NamedQuery(name = "OrdenVenta.findByValorTotal", query = "SELECT o FROM OrdenVenta o WHERE o.valorTotal = :valorTotal")})
public class OrdenVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero_orden_venta")
    private Integer numeroOrdenVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_productos")
    private int cantidadProductos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento")
    private float descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_factura")
    @Temporal(TemporalType.DATE)
    private Date fechaFactura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "observacion")
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtotal")
    private float subtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Total")
    private float valorTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroOrdenVenta", fetch = FetchType.LAZY)
    private List<OrdenVentaProducto> ordenVentaProductoList;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente idCliente;
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id_funcionario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Funcionario idFuncionario;
    @JoinColumn(name = "id_medio_pago", referencedColumnName = "id_medio_pago")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MedioPago idMedioPago;

    public OrdenVenta() {
    }

    public OrdenVenta(Integer numeroOrdenVenta) {
        this.numeroOrdenVenta = numeroOrdenVenta;
    }

    public OrdenVenta(Integer numeroOrdenVenta, int cantidadProductos, float descuento, Date fechaFactura, String observacion, float subtotal, float valorTotal) {
        this.numeroOrdenVenta = numeroOrdenVenta;
        this.cantidadProductos = cantidadProductos;
        this.descuento = descuento;
        this.fechaFactura = fechaFactura;
        this.observacion = observacion;
        this.subtotal = subtotal;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroOrdenVenta() {
        return numeroOrdenVenta;
    }

    public void setNumeroOrdenVenta(Integer numeroOrdenVenta) {
        this.numeroOrdenVenta = numeroOrdenVenta;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @XmlTransient
    public List<OrdenVentaProducto> getOrdenVentaProductoList() {
        return ordenVentaProductoList;
    }

    public void setOrdenVentaProductoList(List<OrdenVentaProducto> ordenVentaProductoList) {
        this.ordenVentaProductoList = ordenVentaProductoList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public MedioPago getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(MedioPago idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroOrdenVenta != null ? numeroOrdenVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenVenta)) {
            return false;
        }
        OrdenVenta other = (OrdenVenta) object;
        if ((this.numeroOrdenVenta == null && other.numeroOrdenVenta != null) || (this.numeroOrdenVenta != null && !this.numeroOrdenVenta.equals(other.numeroOrdenVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.OrdenVenta[ numeroOrdenVenta=" + numeroOrdenVenta + " ]";
    }
    
}
