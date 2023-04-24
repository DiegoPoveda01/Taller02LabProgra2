package org.example;
public class Lunes {
    public static void main(String[] args) {
        llamarMetodos();
    }

    public static void llamarMetodos() {
        int[][] matriz = generarMatriz();
        mostrarMatriz(matriz);
        int[] sumaFilas = sumarFilas(matriz);
        int[] sumaColumnas = sumarColumnas(matriz);
        compararFilasColumnas(matriz, sumaFilas, sumaColumnas);
        encontrarPrimos(matriz);
        numeroPrimo(0);
    }
    public static int[][] generarMatriz() {
        int[][] matriz = new int[5][5];
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*25+1);
            }
        }
        return matriz;
        }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] sumarFilas(int[][] matriz ) {
        int[] sumaFilas = new int[5];
        for (int i = 0; i<sumaFilas.length; i++){
            int suma = 0;
            for(int j = 0; j < sumaFilas.length; j++){
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
        }
        return sumaFilas;
    }
    public static int[] sumarColumnas(int[][] matriz){
        int[] sumaColumnas = new int[5];
        for(int i = 0; i< sumaColumnas.length; i++){
            int suma = 0;
            for (int j = 0; j<sumaColumnas.length; j++){
                suma += matriz[j][i];
            }
            sumaColumnas[i] = suma;
        }
        return sumaColumnas;
    }
    public static void compararFilasColumnas(int[][] matriz, int[] sumaColumnas, int[] sumaFilas) {
        for (int i = 0; i < sumaFilas.length; i++) {
            if (sumaFilas[i] > sumaColumnas[i]) {
                System.out.println("La fila " + (i + 1) + " tiene una suma mayor que la columna " + (i + 1));
            } else if (sumaFilas[i] < sumaColumnas[i]) {
                System.out.println("La columna " + (i + 1) + " tiene una suma mayor que la fila " + (i + 1));
            } else {
                System.out.println("La suma de la fila " + (i + 1) + " es igual a la suma de la columna " + (i + 1));
            }
        }
    }

    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void encontrarPrimos(int[][] matriz){
        int contadorPrimos = 0;
        System.out.print("Los números primos son: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numeroPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                    contadorPrimos++;
                }
            }
        }
        System.out.println();
        System.out.println("La matriz contiene " + contadorPrimos + " números primos.");
    }


}

