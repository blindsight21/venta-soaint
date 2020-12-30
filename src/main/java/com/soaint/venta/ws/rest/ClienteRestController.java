/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.ws.rest;

import com.soaint.venta.domain.Cliente;
import com.soaint.venta.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Omar
 */
@RestController
@RequestMapping(value = "/clientes")
public class ClienteRestController {
    
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping(value = "/create", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Cliente cliente) throws Exception {

        clienteService.create(cliente);

        return ResponseEntity.ok("Registrado correctamente");

    }
}
