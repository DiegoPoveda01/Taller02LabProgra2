package org.example;

import java.util.Scanner;

public class palíndromos {

    public static void main(String[] args) {
        String frase = ingresarFrase();
        String frasevacia = fraseVacia(frase);
        String fraselimpia = fraseLimpia(frasevacia);
        limpiarFrase(fraselimpia);
        boolean esPalindromo = esPalíndromo(fraselimpia);
        imprimirResultado(esPalindromo);
    }
    public static String ingresarFrase() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o un número");
        String frase = leer.nextLine();
        return frase;
    }

    public static String fraseVacia(String frase) {
        if (frase.isEmpty() || frase.isBlank()) {
            System.out.println("Por favor, ingrese una frase válida.");
            return ingresarFrase();
        }
        return frase;
    }

    public static String fraseLimpia(String frasevacia) {
        String fraseLimpia = frasevacia.replaceAll("", "");
        fraseLimpia = fraseLimpia.replaceAll(" ", "").toLowerCase();
        return fraseLimpia;
    }


    public static String limpiarFrase(String fraseLimpia) {
        return fraseLimpia.replaceAll(" ", "").toLowerCase();
    }

    public static boolean esPalíndromo(String fraseLimpia) {
        limpiarFrase(fraseLimpia);
        for (int i = 0; i < fraseLimpia.length() / 2; i++) {
            if (fraseLimpia.charAt(i) != fraseLimpia.charAt(fraseLimpia.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirResultado(boolean esPalindromo) {
        if (esPalindromo) {
            System.out.println("La frase es un palíndromo");
        } else {
            System.out.println("La frase no es un palíndromo");
        }
    }

}
