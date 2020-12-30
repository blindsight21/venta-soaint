/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Venta;
import com.soaint.venta.repository.VentaRepository;
import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar
 */
@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public void create(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public Venta read(BigDecimal id) {

        Optional<Venta> venta = ventaRepository.findById(id);

        if (venta.isPresent()) {
            return venta.get();
        }

        return null;
    }
}
