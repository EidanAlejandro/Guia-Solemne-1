/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclosguiasolemne1;

/**
 *
 * @author eidan
 */
public class Operaciones {
    public static int sumanaturales(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public static boolean primo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean bisiesto(int año) {

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean primorecur(int num, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return primorecur(num, divisor - 1);
    }  
    public static boolean bisiestorecur(int año) {
       
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        }
      
        else if (año % 4 != 0) {
            return false;
        }
      
        else {
            return bisiestorecur(año + 1);
        }
    }  
    public static int sumadigitospares(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            n /= 10;
        }
        return suma;
    }
    public static int productodigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * productodigitos(n / 10);
    }
}
