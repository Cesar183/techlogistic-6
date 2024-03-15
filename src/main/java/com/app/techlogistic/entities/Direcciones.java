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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "direcciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direcciones.findAll", query = "SELECT d FROM Direcciones d"),
    @NamedQuery(name = "Direcciones.findByIdDireccion", query = "SELECT d FROM Direcciones d WHERE d.idDireccion = :idDireccion"),
    @NamedQuery(name = "Direcciones.findByTipoVia", query = "SELECT d FROM Direcciones d WHERE d.tipoVia = :tipoVia"),
    @NamedQuery(name = "Direcciones.findByNumeroVia", query = "SELECT d FROM Direcciones d WHERE d.numeroVia = :numeroVia"),
    @NamedQuery(name = "Direcciones.findByPrefijo", query = "SELECT d FROM Direcciones d WHERE d.prefijo = :prefijo"),
    @NamedQuery(name = "Direcciones.findByNumViaVeneradora", query = "SELECT d FROM Direcciones d WHERE d.numViaVeneradora = :numViaVeneradora"),
    @NamedQuery(name = "Direcciones.findByPrefijoViaGeneradora", query = "SELECT d FROM Direcciones d WHERE d.prefijoViaGeneradora = :prefijoViaGeneradora"),
    @NamedQuery(name = "Direcciones.findByNumeroPlaca", query = "SELECT d FROM Direcciones d WHERE d.numeroPlaca = :numeroPlaca"),
    @NamedQuery(name = "Direcciones.findByBarrio", query = "SELECT d FROM Direcciones d WHERE d.barrio = :barrio"),
    @NamedQuery(name = "Direcciones.findByCiudad", query = "SELECT d FROM Direcciones d WHERE d.ciudad = :ciudad")})
public class Direcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_direccion")
    private Integer idDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipo_via")
    private String tipoVia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "numero_via")
    private String numeroVia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "prefijo")
    private String prefijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "num_via_veneradora")
    private String numViaVeneradora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "prefijo_via_generadora")
    private String prefijoViaGeneradora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "numero_placa")
    private String numeroPlaca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "barrio")
    private String barrio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ciudad")
    private String ciudad;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personas idPersona;

    public Direcciones() {
    }

    public Direcciones(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Direcciones(Integer idDireccion, String tipoVia, String numeroVia, String prefijo, String numViaVeneradora, String prefijoViaGeneradora, String numeroPlaca, String barrio, String ciudad) {
        this.idDireccion = idDireccion;
        this.tipoVia = tipoVia;
        this.numeroVia = numeroVia;
        this.prefijo = prefijo;
        this.numViaVeneradora = numViaVeneradora;
        this.prefijoViaGeneradora = prefijoViaGeneradora;
        this.numeroPlaca = numeroPlaca;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNumeroVia() {
        return numeroVia;
    }

    public void setNumeroVia(String numeroVia) {
        this.numeroVia = numeroVia;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getNumViaVeneradora() {
        return numViaVeneradora;
    }

    public void setNumViaVeneradora(String numViaVeneradora) {
        this.numViaVeneradora = numViaVeneradora;
    }

    public String getPrefijoViaGeneradora() {
        return prefijoViaGeneradora;
    }

    public void setPrefijoViaGeneradora(String prefijoViaGeneradora) {
        this.prefijoViaGeneradora = prefijoViaGeneradora;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Personas getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Personas idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direcciones)) {
            return false;
        }
        Direcciones other = (Direcciones) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.techlogistic.entities.Direcciones[ idDireccion=" + idDireccion + " ]";
    }
    
}
