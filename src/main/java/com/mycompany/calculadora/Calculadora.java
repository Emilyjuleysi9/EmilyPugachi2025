/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ASUS
 */

public class Calculadora {
    private double resultadoActual;
    private Stack<Double> pilaResultados;
    private Stack<Double> pilaRehacer;

    public Calculadora() { 
        resultadoActual = 0;
        pilaResultados = new Stack<>();
        pilaRehacer = new Stack<>();
    }

    //Proceso de sumar 
    public void sumar(double numero) {
        pilaResultados.push(resultadoActual); 
        resultadoActual += numero;
        pilaRehacer.clear(); 
    }

    //El proces de deshacer 
    public void deshacer() {
        if (!pilaResultados.isEmpty()) {
            pilaRehacer.push(resultadoActual); 
            resultadoActual = pilaResultados.pop(); 
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }

    
    public void rehacer() {
        if (!pilaRehacer.isEmpty()) {
            pilaResultados.push(resultadoActual); 
            resultadoActual = pilaRehacer.pop(); 
        } else {
            System.out.println("No hay operaciones para rehacer.");
        }
    }

    
    public void mostrarResultado() {
        System.out.println("Resultado actual: " + resultadoActual);
    }
}

    
    