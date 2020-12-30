/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Detalleventa;
import com.soaint.venta.repository.DetalleVentaRepository;
import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar
 */
@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    DetalleVentaRepository detalleVentaRepository;

    @Override
    public Detalleventa findByIdVenta(BigDecimal idVenta) {

        Optional<Detalleventa> detalleVenta = detalleVentaRepository.findByIdVenta(idVenta);
        
        if (detalleVenta.isPresent()) {
            return detalleVenta.get();
        }

        return null;
    }

}
