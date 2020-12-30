/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "SQ_CLIENTE", sequenceName = "SQ_CLIENTE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLIENTE")
    @Basic(optional = false)
    @Column(name = "IDCLIENTE")
    private BigDecimal idCliente;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "DNI")
    private BigInteger dni;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(mappedBy = "idCliente")
    private List<Venta> ventaList;

    public Cliente() {
    }

    public Cliente(BigDecimal idCliente) {
        this.idCliente = idCliente;
    }

    public BigDecimal getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(BigDecimal idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigInteger getDni() {
        return dni;
    }

    public void setDni(BigInteger dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public String toString() {
        return "com.soaint.venta.domain.Cliente[ idcliente=" + idCliente + " ]";
    }
    
}
