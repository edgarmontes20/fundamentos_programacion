/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulamatriz.fundamentos.interfazusuariosjava.utilities;

import com.aulamatriz.fundamentos.interfazusuariosjava.abstraccion.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author PC2-AULA303
 */
public class Utils {

    public static void guardarUsuario(Usuario usuario) {
        String cadenaConcatenada;
        cadenaConcatenada = usuario.getNombre() + ";" + usuario.getApellido()
                + ";" + usuario.getTipoDocumento() + ";" + usuario.getNumeroDocumento();
        /**
         * escribir en fichero *
         */
        try {
             //FileWriter fichero = null;
        // Directory Path
        Path dirPath = Paths.get("C:\\mi_directorio");

        boolean result = false;

        // Si no existe lo creamos
        if (Files.notExists(dirPath)) {
            // Directory not exists
            File directory = new File("C:\\mi_directorio");
            System.out.println("Directory created.");
            result = directory.mkdir();
        }
            FileWriter fichero = new FileWriter("C:\\mi_directorio\\Usuarios.txt", true);
            try ( BufferedWriter almacen = new BufferedWriter(fichero)) {
                almacen.write(cadenaConcatenada + "\n");
                almacen.close();
            } catch (Exception ex) {
            }
            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

    /**
     * Leer del fichero *
     */
    public ArrayList<String> leerFichero() {
        ArrayList<String> contenidoFichero = new ArrayList<>();
        try {
            FileReader fichero = new FileReader("C:\\mi_directorio\\Usuarios.txt");
            BufferedReader lectura = new BufferedReader(fichero);
            String cadena;
            while ((cadena = lectura.readLine()) != null) {
                contenidoFichero.add(cadena);
            }

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
        return contenidoFichero;
    }
}
