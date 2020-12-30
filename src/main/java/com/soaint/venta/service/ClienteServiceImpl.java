/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.service;

import com.soaint.venta.domain.Cliente;
import com.soaint.venta.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public void create(Cliente cliente){
        clienteRepository.save(cliente);
    }
}
