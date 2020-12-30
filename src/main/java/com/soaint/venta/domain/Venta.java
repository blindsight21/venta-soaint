/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "VENTA")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "SQ_VENTA", sequenceName = "SQ_VENTA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_VENTA")
    @Basic(optional = false)
    @Column(name = "IDVENTA")
    private BigDecimal idventa;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "IDCLIENTE")
    @ManyToOne
    private Cliente idCliente;
    @OneToMany(mappedBy = "idVenta")
    private List<Detalleventa> detalleVentaList;

    public Venta() {
    }

    public Venta(BigDecimal idventa) {
        this.idventa = idventa;
    }

    public BigDecimal getIdventa() {
        return idventa;
    }

    public void setIdventa(BigDecimal idventa) {
        this.idventa = idventa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        return "com.soaint.venta.domain.Venta[ idventa=" + idventa + " ]";
    }

}
