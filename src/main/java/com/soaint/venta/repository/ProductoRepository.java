/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.repository;

import com.soaint.venta.domain.Producto;
import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Omar
 */
public interface ProductoRepository extends JpaRepository<Producto, BigDecimal>{
    
}
