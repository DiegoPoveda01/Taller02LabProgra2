package org.example;

import java.util.Scanner;

public class Taller01 {
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
            System.out.println("Qué desea realizar");
            System.out.println("1) Agregar estudiante.");
            System.out.println("2) Mostrar cantidad de estudiantes que aprueban la asignatura.");
            System.out.println("3) Mostrar cantidad de estudiantes que reprueban la asignatura.");
            System.out.println("4) Mostrar cantidad de estudiantes que van a exámen.");
            System.out.println("5) Mostrar el estado de todos los estudiantes");
            System.out.println("6) Salir.");
            opcion = leer.nextInt();
        }
        if (opcion == 1) {
            agregarNotas(matriz);
        }
        if (opcion == 2) {
            aprobacionEstudiantes(matriz);
        }
        if (opcion == 3) {
            estudiantesReprobados(matriz);
        }
        if (opcion == 4) {
            estudiantesExamen(matriz);
        }
        if (opcion == 5) {
            estadoEstudiantes(matriz);
        }
        if (opcion == 6) {
            System.out.println("Saludos.");
            menu(matriz);
        }
        if (opcion > 6) {
            System.out.println("Ingrese un número correcto por favor.");
            menu(matriz);
        }
    }

    public static double rellenarMatriz() {
        return ((Math.random() * 6.0) + 1.0);
    }

    public static double[][] generarMatriz() {
        Scanner leer = new Scanner(System.in);
        double[][] matriz = new double[50][5];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rellenarMatriz();
                ;
            }
        }
        return matriz;
    }

    public static double[][] agregarNotas(double[][] matriz) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos estudiantes desea agregar?");
        int estudiantes = leer.nextInt();
        if (estudiantes > 50) {
            System.out.println("No podemos contar con esa cantidad de estudiantes.");
            return matriz;
        }
        for (int i = matriz.length; i < matriz.length + estudiantes && i < 50; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rellenarMatriz();
            }
        }
        return matriz;
    }

    public static double promedioEstudiantes(double[] notas) {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            if (i <= 2) {
                promedio += notas[i] * 0.25;
            } else if (i == 3) {
                promedio += notas[i] * 0.15;
            } else {
                promedio += notas[i] * 0.10;
            }
        }
        return promedio;
    }

    public static void aprobacionEstudiantes(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            boolean aprobados = false;
            for (int j = 0; j < matriz[i].length; j++) {
                double promedio = promedioEstudiantes(matriz[i]);
                if (promedio >= 3.95) {
                    aprobados = true;
                        System.out.println("Estudiante " + (i + 1) + ": es aprobado");
                    }
                }

            }
        }


    public static void estudiantesReprobados(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int reprobados = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                double promedio = promedioEstudiantes(matriz[i]);
                if (promedio < 3.95) {
                    reprobados++;
                    System.out.println("Estudiante " + (i + 1) + ": es reprobado");
                }
            }
        }
    }

    public static void estudiantesExamen(double[][] matriz) {
        int estudiantesExamen = 0;
        for (int i = 0; i < matriz.length; i++) {
            double promedio = promedioEstudiantes(matriz[i]);
            if (promedio < 3.95 && promedio >= 3.0) {
                estudiantesExamen++;
            }
        }
        System.out.println("Cantidad de estudiantes que van a examen: " + estudiantesExamen);
    }
    public static void estadoEstudiantes(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            double[] notas = matriz[i];
            double promedio = promedioEstudiantes(notas);
            String estado = "";
            if (promedio >= 3.95) {
                estado = "Aprobado";
            } else if (promedio >= 3.0) {
                estado = "Va a examen";
            } else {
                estado = "Reprobado";
            }
            System.out.println("Estudiante " + (i+1) + ": promedio = " + promedio + ", estado = " + estado);
        }
    }

}

