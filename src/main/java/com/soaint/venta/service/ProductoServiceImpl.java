/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Producto;
import com.soaint.venta.repository.ProductoRepository;
import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void create(Producto producto) {

        productoRepository.save(producto);
    }

    @Override
    public Producto read(BigDecimal id) {

        Optional<Producto> producto = productoRepository.findById(id);

        if (producto.isPresent()) {
            return producto.get();
        }

        return null;
    }

    @Override
    public void update(Producto producto) {

        productoRepository.save(producto);
    }

    @Override
    public void delete(Producto producto) {

        productoRepository.delete(producto);
    }
}
