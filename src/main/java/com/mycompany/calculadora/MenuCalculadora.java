/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner Leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú Principal");
            System.out.println("1. Sumar");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar resultado actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para sumar: ");
                    double numero = Leer.nextDouble();
                    calculadora.sumar(numero);
                    break;
                case 2:
                    calculadora.deshacer();
                    break;
                case 3:
                    calculadora.rehacer();
                    break;
                case 4:
                    calculadora.mostrarResultado();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        Leer.close();
    }
    }

