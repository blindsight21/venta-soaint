/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.ws.rest;

import com.soaint.venta.domain.Detalleventa;
import com.soaint.venta.service.DetalleVentaService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Omar
 */
@RestController
@RequestMapping(value = "/detalleventas")
public class DetalleVentaRestController {
    
    @Autowired
    private DetalleVentaService detalleVentaService;
    
    @PostMapping(value = "/read/{idVenta}", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity read(@PathVariable("idVenta") BigDecimal idVenta) throws Exception {
        Detalleventa detalleVenta = detalleVentaService.findByIdVenta(idVenta);
        return ResponseEntity.ok(detalleVenta);
    }
}
