/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Venta;
import java.math.BigDecimal;

/**
 *
 * @author Omar
 */
public interface VentaService {
    
    void create(Venta venta);
    
    Venta read(BigDecimal id);
}
