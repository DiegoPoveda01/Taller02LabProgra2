package org.example;
import java.util.Scanner;
public class Letra {
    public static void main(String[] args) {
        llamarMetodos();
    }

    public static void llamarMetodos() {
        Scanner leer = new Scanner(System.in);
        String frase = pedirFrase(leer);
        char letra = pedirLetra(leer);
        int contador = contarLetra(frase, letra);
        mostrarResultado(letra, contador);
    }
    public static String pedirFrase(Scanner leer) {
        System.out.print("Introduzca una frase: ");
        return leer.nextLine();
    }

    public static char pedirLetra(Scanner leer) {
        char letra = ' ';
        while (letra == ' ') {
            System.out.print("Introdzca la letra que desee encontrar: ");
            String entrada = leer.next();
            if (entrada.length() != 1) {
                System.out.println("Ingrese sólo una letra.");
            } else {
                letra = entrada.charAt(0);
            }
        }
        return letra;
    }

    public static int contarLetra(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultado(char letra, int contador) {
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
}
