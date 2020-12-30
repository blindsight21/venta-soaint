/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Detalleventa;
import java.math.BigDecimal;

/**
 *
 * @author Omar
 */
public interface DetalleVentaService {
    
    Detalleventa findByIdVenta(BigDecimal idVenta);
}
