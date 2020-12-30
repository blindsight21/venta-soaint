/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.ws.rest;

import com.soaint.venta.domain.Venta;
import com.soaint.venta.service.VentaService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Omar
 */
@RestController
@RequestMapping(value = "/ventas")
public class VentaRestController {
    
    @Autowired
    private VentaService ventaService;
    
    @PostMapping(value = "/create", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Venta venta) throws Exception {

        ventaService.create(venta);

        return ResponseEntity.ok("Registrado correctamente");
    }
    
    @GetMapping(value = "/read/{id}")
    public ResponseEntity find(@PathVariable("id") BigDecimal id) throws Exception {

        Venta venta = ventaService.read(id);
        
        return ResponseEntity.ok(venta);
    }
    
}
