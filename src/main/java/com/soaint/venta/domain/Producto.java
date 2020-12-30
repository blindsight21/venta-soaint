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
@Table(name = "PRODUCTO")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "SQ_PRODUCTO", sequenceName = "SQ_PRODUCTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUCTO")
    @Basic(optional = false)
    @Column(name = "IDPRODUCTO")
    private BigDecimal idProducto;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PRECIO")
    private BigInteger precio;
    @OneToMany(mappedBy = "idProducto")
    private List<Detalleventa> detalleVentaList;

    public Producto() {
    }

    public Producto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public BigDecimal getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<Detalleventa> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<Detalleventa> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    @Override
    public String toString() {
        return "com.soaint.venta.domain.Producto_1[ idproducto=" + idProducto + " ]";
    }
    
}
