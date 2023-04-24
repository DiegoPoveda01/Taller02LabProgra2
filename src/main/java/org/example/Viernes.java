package org.example;

import java.util.Scanner;

public class Viernes {
    public static void main(String[] args) {
        llamarMetodos();
    }

    public static void llamarMetodos() {
        Scanner leer = leer();
        int n = numero(leer);
        fibonacci(n);
        mostrarFibonacci(n);
    }
  public static Scanner leer(){
      Scanner leer = new Scanner(System.in);
      return leer;
  }
    private static int numero(Scanner leer) {
        System.out.println("Ingrese número Fibonacci a calcular: ");
        int n = leer.nextInt();
        return n;
    }

    public static int fibonacci(int n) {
     if(n<=1){
         return n;
     }
      else return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void mostrarFibonacci(int n){
        System.out.println("Resultado: ");
        System.out.println(fibonacci(n));
    }
}
