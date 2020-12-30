/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Producto;
import java.math.BigDecimal;

/**
 *
 * @author Omar
 */
public interface ProductoService {
    
    void create(Producto producto);
    
    Producto read(BigDecimal id);
    
    void update (Producto producto);
    
    void delete (Producto producto);
}
