package com.soaint.venta;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//        (scanBasePackages={"com.soaint.venta.config"})
public class VentaApplication implements ApplicationRunner {
    
    private static final Logger logger = LogManager.getLogger(VentaApplication.class);
    
    public static void main(String[] args) {
        SpringApplication.run(VentaApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

}
