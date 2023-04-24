package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ayudantía5 {
    public static void main(String[] args) {
        llamarMetodos();
    }

    public static void llamarMetodos() {
        ingresarNombre();
        ingresarRut();
        ingresarEdad();
        ingresarEstatura();
        ingresarPeso();
        agradecimiento();
    }
    public static String ingresarNombre() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        while (!nombre.matches("[a-zA-Z]+")) {
            System.out.println("Ingrese un nombre válido por favor");
            nombre = leer.nextLine();
        }
        return nombre;

    }

    public static String ingresarRut() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su RUT");
        String rut;
        try {
            rut = leer.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("El RUT ingresado no es válido, ingreselo nuevamente");
            return ingresarRut();
        }
        if (rut.length() > 12){
            System.out.println("El RUT ingresado no es válido, ingreselo nuevamente");
            return ingresarRut();
        }
        return rut;
    }


    public static int ingresarEdad() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = 0;
        try {
            edad = leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("La edad ingresada no es válida, ingresela nuevamente");
            return ingresarEdad();
        }
        if (edad > 120 || edad < 0) {
            System.out.println("La edad ingresada no es válida, ingresela nuevamente");
            return ingresarEdad();
        }
        return edad;
    }

    public static float ingresarEstatura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su estatura");
        float estatura = 0;
        try {
            estatura = leer.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("La estatura ingresada no es válida, ingresela nuevamente");
            return ingresarEstatura();
        }
        if (estatura > 2.5 || estatura < 0) {
            System.out.println("La estatura ingresada no es válida, ingresela nuevamente");
            return ingresarEstatura();
        }
        return estatura;
    }

    public static float ingresarPeso() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        float peso = 0;
        try {
            peso = leer.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("El peso ingresado no es válido, por favor, ingreselo nuevamente.");
            return ingresarPeso();
        }
        if (peso > 250 || peso < 0) {
            System.out.println("El peso ingresado no es válido, por favor, ingreselo nuevamente.");
            return ingresarPeso();
        }
        return peso;
    }
    public static void agradecimiento() {
        System.out.println("Muchas gracias por su ayuda.");
    }
}