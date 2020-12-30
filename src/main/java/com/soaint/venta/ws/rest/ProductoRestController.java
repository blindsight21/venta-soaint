/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.ws.rest;

import com.soaint.venta.domain.Producto;
import com.soaint.venta.service.ProductoService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Omar
 */
@RestController
@RequestMapping(value = "/productos")
public class ProductoRestController {
    
    @Autowired
    private ProductoService productoService;
    
    @PostMapping(value = "/create", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Producto producto) throws Exception {

        productoService.create(producto);

        return ResponseEntity.ok("Registrado correctamente");
    }
    
    @GetMapping(value = "/read/{id}")
    public ResponseEntity find(@PathVariable("id") BigDecimal id) throws Exception {

        Producto producto = productoService.read(id);
        
        return ResponseEntity.ok(producto);
    }
    
    @PutMapping(value = "/update", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity update(@RequestBody Producto producto) throws Exception {

        productoService.update(producto);

        return ResponseEntity.ok("Actualizado correctamente");
    }
    
    @DeleteMapping(value = "/delete", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@RequestBody Producto producto) throws Exception {

        productoService.delete(producto);

        return ResponseEntity.ok("Eliminado correctamente");
    }
    
}
