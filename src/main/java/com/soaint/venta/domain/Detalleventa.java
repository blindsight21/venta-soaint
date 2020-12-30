/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "DETALLEVENTA")
public class Detalleventa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "SQ_DETALLEVENTA", sequenceName = "SQ_DETALLEVENTA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DETALLEVENTA")
    @Basic(optional = false)
    @Column(name = "IDDETALLEVENTA")
    private BigDecimal idDetalleVenta;
    @JoinColumn(name = "IDPRODUCTO", referencedColumnName = "IDPRODUCTO")
    @ManyToOne
    private Producto idProducto;
    @JoinColumn(name = "IDVENTA", referencedColumnName = "IDVENTA")
    @ManyToOne
    private Venta idVenta;

    public Detalleventa() {
    }

    public Detalleventa(BigDecimal idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public BigDecimal getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(BigDecimal idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdproducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Venta getIdventa() {
        return idVenta;
    }

    public void setIdventa(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public String toString() {
        return "com.soaint.venta.domain.Detalleventa[ iddetalleventa=" + idDetalleVenta + " ]";
    }
    
}
