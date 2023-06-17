/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionconsola.matematicas;

/**
 *
 * @author PC2-AULA303
 */
public class Calculadora {
    /**
     * Atributos
     */
    private double operacion1;
    
    private double operacion2;
    
    /*
    Construtor, los insumos para poder instanciar, usar una clase
    */
    public Calculadora(double operacion1, double operacion2) {
        this.operacion1 = operacion1;
        this.operacion2 = operacion2;
    }
    
    /*
    Metodos
    */
    public double getSuma(){
        return this.operacion1+this.operacion2;
    }
    public double getResta(){
        return this.operacion1-this.operacion2;
    }
    public double getMultiplicacion(){
        return this.operacion1*this.operacion2;
    }//public todos lo ven, void no retorna
    public void getDivision(){
        try {
            double resultado=operacion1/operacion2;
            System.out.println("El resultado de la / es " + resultado);
        } catch (Exception e) {
            System.err.println("No se puede dividir por cero 0");
            System.err.println(e.getMessage());
        }
        //this.operacion1/this.operacion2;
    }

}
