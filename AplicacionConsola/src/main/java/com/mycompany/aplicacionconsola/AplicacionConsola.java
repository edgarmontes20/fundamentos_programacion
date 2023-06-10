/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicacionconsola;

import com.mycompany.aplicacionconsola.matematicas.Calculadora;
import java.util.Scanner;

/**
 * Este programa es una calculadora
 * @author PC2-AULA303
 */
public class AplicacionConsola {
    public static void main(String[] args) {
        // este es un objeto para leer por teclado
        Scanner leerPorTeclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado;
        int opcion;
        System.out.println("Hola soy una calculadora");
        System.out.println("Ingresa una opcion para calcular "
                + " 1. Suma , 2. Resta, 3. Multiplicacion, 4.Division ");
        opcion=leerPorTeclado.nextInt();
        System.out.println("Digito la opcion " + opcion);
        System.out.println("Escribe el primer numero para operar");
        numero1=leerPorTeclado.nextDouble();
        System.out.println("Escribe el segundo numero para operar");
        numero2=leerPorTeclado.nextDouble();
        System.out.println("primer numero es " + numero1);
        System.out.println("segundo numero es " + numero2);
        
        Calculadora calculadora = new Calculadora(numero1, numero2);
                
        if (opcion == 1) {
            resultado = calculadora.getSuma();
            System.out.println("resultado = " + resultado);
        } else if (opcion == 2) {
            resultado = calculadora.getResta();
            System.out.println("resultado = " + resultado);
        }
        if (opcion == 3) {
            resultado = calculadora.getMultiplicacion();
            System.out.println("resultado = " + resultado);
        } else if (opcion == 4 ) {
                calculadora.getDivision();
        } else {
            System.out.println("opcion no valida");
        }
    }
}
