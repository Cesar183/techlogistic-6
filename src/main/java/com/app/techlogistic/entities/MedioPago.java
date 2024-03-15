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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "medio_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedioPago.findAll", query = "SELECT m FROM MedioPago m"),
    @NamedQuery(name = "MedioPago.findByIdMedioPago", query = "SELECT m FROM MedioPago m WHERE m.idMedioPago = :idMedioPago"),
    @NamedQuery(name = "MedioPago.findByDescripcionPago", query = "SELECT m FROM MedioPago m WHERE m.descripcionPago = :descripcionPago")})
public class MedioPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medio_pago")
    private Integer idMedioPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descripcion_pago")
    private String descripcionPago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedioPago", fetch = FetchType.LAZY)
    private List<OrdenVenta> ordenVentaList;

    public MedioPago() {
    }

    public MedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public MedioPago(Integer idMedioPago, String descripcionPago) {
        this.idMedioPago = idMedioPago;
        this.descripcionPago = descripcionPago;
    }

    public Integer getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getDescripcionPago() {
        return descripcionPago;
    }

    public void setDescripcionPago(String descripcionPago) {
        this.descripcionPago = descripcionPago;
    }

    @XmlTransient
    public List<OrdenVenta> getOrdenVentaList() {
        return ordenVentaList;
    }

    public void setOrdenVentaList(List<OrdenVenta> ordenVentaList) {
        this.ordenVentaList = ordenVentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedioPago != null ? idMedioPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedioPago)) {
            return false;
        }
        MedioPago other = (MedioPago) object;
        if ((this.idMedioPago == null && other.idMedioPago != null) || (this.idMedioPago != null && !this.idMedioPago.equals(other.idMedioPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.MedioPago[ idMedioPago=" + idMedioPago + " ]";
    }
    
}
