package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Cuadrado{
    public static void main(String[] args) {
        int[][] matriz = generarMatriz();
        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);
        if (esCuadradoMagico(matriz)) {
            System.out.println("La matriz es un cuadrado mágico.");
        } else {
            System.out.println("La matriz no es un cuadrado mágico.");
        }
    }

    public static int[][] generarMatriz() {
        int[][] matriz = new int[3][3];
        List<Integer> digitos = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            digitos.add(i);
        }
        Collections.shuffle(digitos, new Random(System.nanoTime()));
        int indice = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = digitos.get(indice);
                indice++;
            }
        }
        return matriz;
    }

    public static boolean esCuadradoMagico(int[][] matriz) {
        int diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int diagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (diagonal1 != 15 || diagonal2 != 15) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            int fila = 0;
            int columna = 0;
            for (int j = 0; j < 3; j++) {
                fila += matriz[i][j];
                columna += matriz[j][i];
            }
            if (fila != 15 || columna != 15) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
