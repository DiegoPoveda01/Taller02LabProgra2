package org.example;

import java.util.Scanner;

public class Ayudantían4 {
    public static void main(String[] args) {
        llamarMetodos();
    }

    public static void llamarMetodos() {
        double matriz[][] = generarMatriz();
        menu(matriz);
    }

    public static void menu(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        while (opcion == 0) {
            System.out.println("Qué desea buscar");
            System.out.println("1) Intensidad, día y hora del sismo más intenso.");
            System.out.println("2) Total días en que se registraron sismos mayores o iguales a 5.5 grados.");
            System.out.println("3) Alerta de escalada sísmica.");
            System.out.println("4) Alerta de enjambre sísmico.");
            System.out.println("5) Salir.");
            opcion = leer.nextInt();
        }
        if (opcion == 1) {
            intensidadSismo(matriz);
        }
        if (opcion == 2) {
            sismos(matriz);
        }
        if (opcion == 3) {
            escaladaSismica(matriz);
        }
        if (opcion == 4) {
            enjambreSismico(matriz);
        }
        if (opcion == 5) {
            System.out.println("Saludos.");
            menu(matriz);
        }
        if (opcion > 5) {
            System.out.println("Ingrese un número correcto por favor.");
            menu(matriz);
        }
    }

    public static double[][] generarMatriz() {
        double[][] matriz = new double[31][24];
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 24; j++) {
                matriz[i][j] = Math.random() * 9 + 0.5;
            }
        }

        return matriz;
    }

    public static void intensidadSismo(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        double intensidad = 0;
        int día = 0;
        int hora = 0;
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 24; j++) {
                if (matriz[i][j] > intensidad) {
                    intensidad = matriz[i][j];
                    día = i + 1;
                    hora = j;
                }
            }
        }
        System.out.println("El sismo de mayor intensidad fue de " + intensidad + " el día " + día + " a la hora " + hora);
        int opcion = 0;
        System.out.println("1) Si desea seguir operando.");
        opcion = leer.nextInt();
        if (opcion == 1) {
            menu(matriz);
        }
    }

    public static void sismos(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int sismos = 0;
        boolean[] diasContados = new boolean[31];
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 24; j++) {
                if (matriz[i][j] >= 5.5 && !diasContados[i]) {
                    diasContados[i] = true;
                    sismos++;
                }
            }
        }
        System.out.println("La cantidad de días que se registraron sismos iguales o mayores a 5.5 grados fueron " + sismos);
        int opcion = 0;
        System.out.println("1) Si desea seguir operando.");
        opcion = leer.nextInt();
        if (opcion == 1) {
            menu(matriz);
        }
    }

    public static void escaladaSismica(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int[] diasConEscalada = new int[31];
        int contadorDias = 0;

        for (int i = 0; i < 31; i++) {
            int horasSeguidas = 0;
            for (int j = 0; j < 24; j++) {
                if (matriz[i][j] >= 6.0) {
                    horasSeguidas++;
                } else {
                    horasSeguidas = 0;
                }

                if (horasSeguidas == 4) {
                    diasConEscalada[contadorDias] = i + 1;
                    contadorDias++;
                    break;
                }
            }
        }

        if (contadorDias == 0) {
            System.out.println("No se encontró ninguna escalada sísmica.");
        } else {
            System.out.println("Se encontraron escaladas sísmicas en los siguientes días:");
            for (int i = 0; i < contadorDias; i++) {
                System.out.println(diasConEscalada[i]);
            }
        }
        int opcion = 0;
        System.out.println("1) Si desea seguir operando.");
        opcion = leer.nextInt();
        if (opcion == 1) {
            menu(matriz);
        }
    }

    public static void enjambreSismico(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int[] diasConEscalada = new int[31];
        int contadorDias = 0;

        for (int i = 0; i < 31; i++) {
            int horasSeguidas = 0;
            boolean tieneEscalada = false;
            for (int j = 0; j < 24; j++) {
                if (matriz[i][j] >= 6.0) {
                    horasSeguidas++;
                    tieneEscalada = true;
                } else {
                    horasSeguidas = 0;
                }

                if (horasSeguidas == 4) {
                    diasConEscalada[contadorDias] = i + 1;
                    contadorDias++;
                    break;
                }
            }
            if (!tieneEscalada) {
                contadorDias = 0;
            }
            if (contadorDias == 3) {
                System.out.println("Enjambre sísmico desde el día " + (i-2) + " hasta el día " + i);
                contadorDias = 2;
            }
        }
        int opcion = 0;
        System.out.println("1) Si desea seguir operando.");
        opcion = leer.nextInt();
        if (opcion == 1) {
            menu(matriz);
        }
    }





}
        

