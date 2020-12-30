/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Omar
 */
public class Util {

    public static boolean leerArchivoTxtUsuarios(String usuarioIngresado, String passwordIngresado) {

        try {
            BufferedReader buffer = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(System.getProperty("user.dir") + "\\usuarios.txt"), "utf-8"));

            String registroPorLinea = "";

            boolean esUsuarioCorrecto = false;

            while ((registroPorLinea = buffer.readLine()) != null) {
                String[] partes = registroPorLinea.split(",");

                String usuario = "";
//                String password = "";

                int columna = 0;
                for (String parte : partes) {
                    columna++;
                    if (columna == 1) {
                        usuario = parte;
                        continue;
                    }
//                    password = parte;
                }

                esUsuarioCorrecto = usuarioIngresado.equals(usuario);
//                        && passwordIngresado.equals(password);

                if (esUsuarioCorrecto) {
                    break;
                }
            }

            return esUsuarioCorrecto;

        } catch (Exception e) {

        }
        return false;
    }

}
