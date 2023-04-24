package org.example;

import java.util.Scanner;

public class probar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de n para calcular el n-ésimo término de la sucesión de Fibonacci: ");
        int n = input.nextInt();
        int resultado = fibonacci(n);
        System.out.println("El " + n + "-ésimo término de la sucesión de Fibonacci es " + resultado);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
