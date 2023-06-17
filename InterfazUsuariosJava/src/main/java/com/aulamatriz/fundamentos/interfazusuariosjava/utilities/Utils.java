/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulamatriz.fundamentos.interfazusuariosjava.utilities;

import com.aulamatriz.fundamentos.interfazusuariosjava.abstraccion.Usuario;
import java.io.FileWriter;

/**
 *
 * @author PC2-AULA303
 */
public class Utils {

    public static void guardarUsuario(Usuario usuario) {
        String cadenaConcatenada;

        cadenaConcatenada = usuario.getNombre() + ";" + usuario.getApellido()
                + ";" + usuario.getTipoDocumento() + ";" + usuario.getNumeroDocumento();
         
            //String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..."};

            /**
             * FORMA 1 DE ESCRITURA *
             */
            FileWriter fichero = null;
            try {

                fichero = new FileWriter("C:\\Users\\PC2-AULA303\\Documents\\git_edgar_montes\\fundamentos_programacion\\Usuarios.txt");

                // Escribimos linea a linea en el fichero
		//	for (String linea : lineas) {
		//		fichero.write(linea + "\n");
		//	}
                // Escribimos linea a linea en el fichero
                fichero.write(cadenaConcatenada + "\n");
                
                fichero.close();

            } catch (Exception ex) {
                System.out.println("Mensaje de la excepción: " + ex.getMessage());
            }
        }
}

