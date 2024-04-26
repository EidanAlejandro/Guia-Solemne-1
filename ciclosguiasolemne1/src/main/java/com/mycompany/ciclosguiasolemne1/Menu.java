/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclosguiasolemne1;
import java.util.Scanner;
/**
 *
 * @author eidan
 */
public class Menu {

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Suma de numeros naturales hasta 10");
            System.out.println("2. Factorial de un numero ingresado");
            System.out.println("3. Potencia de 3 elevado a 4");
            System.out.println("4. Determinar si un numero ingresado es primo");
            System.out.println("5. Determinar si un año ingresado es bisiesto");
            System.out.println("6. Determinar si el numero 7 es primo (recursividad)");
            System.out.println("7. Determinar si un año ingresado es bisiesto (ciclos)");
            System.out.println("8. Suma de los digitos pares de 1435");
            System.out.println("9. Producto de los digitos de un numero ingreado");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido para elegir la opcion: ");
            scanner.next();
            }
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("La suma de los numeros naturales hasta 10 es: " + Operaciones.sumanaturales(10));
                    break;
                case 2:
                    System.out.print("Ingrese un numero para calcular su factorial: ");
                    int n = scanner.nextInt();
                    System.out.println("El factorial de " + n + " es: " + Operaciones.factorial(n));
                    break;
                case 3:
                    System.out.println("el resultado de 3 elevado a la 4 es: " + Operaciones.potencia(3, 4));
                    break;
                case 4:
                    System.out.print("Ingrese un numero para verificar si es primo: ");
                    int n1 = scanner.nextInt();
                    if (Operaciones.primo(n1)) {
                        System.out.println(n1 + " es primo.");
                    } else {
                        System.out.println(n1 + " no es primo.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese un año para determinar si es bisiesto: ");
                    int año = scanner.nextInt();
                    if (Operaciones.bisiestorecur(año)) {
                        System.out.println(año + " es un año bisiesto.");
                    } else {
                        System.out.println(año + " no es un año bisiesto.");
                    }
                    break;
                case 6:
                    if (Operaciones.primorecur(7, 7/2)) {
                        System.out.println(7 + " es primo.");
                    } else {
                        System.out.println(7 + " no es primo.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese un año para verificar si es bisiesto : ");
                    int año2 = scanner.nextInt();
                    if (Operaciones.bisiesto(año2)) {
                        System.out.println(año2 + " es un año bisiesto.");
                    } else {
                        System.out.println(año2 + " no es un año bisiesto.");
                    }
                    break;
                case 8:
                    System.out.println("La suma de los digitos pares de 1435 es:" + Operaciones.sumadigitospares(1435));
                    break;
                case 9:
                    System.out.print("Ingrese un numero para calcular el producto de sus digitos: ");
                    int n2 = scanner.nextInt();
                    System.out.println("El producto de los digitos de " + n2 + " es: " + Operaciones.productodigitos(n2));
                    break;        
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("opcion invalida, por favor ingresar opcion valida.");

            }
        } while (op != 0);
    }
}
