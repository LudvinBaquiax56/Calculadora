/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author baquiax
 */
public class Calculadora {

    public Calculadora() {
    }

    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double division(double numero1, double numero2) {
        return (numero2 == 0) ? -1 : (int) numero1 / numero2;
    }

    public double numeroMayor(double numero1, double numero2) {
        return (numero1 > numero2) ? numero1 : numero2;
    }

    public double potencia(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public String binario(double numero) {
        String binario = "";
        while (numero >= 0) {
            binario = binario + ((int) (numero % 2));
            numero = numero / 2;
        }
        return binario;
    }
}
