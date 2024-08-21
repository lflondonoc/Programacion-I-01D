package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        int numero = ingresarEntero("Ingrese un numero para calcular su factorial: ");
        int factorial = calcularFactorial(numero);
        String mensaje = generarMensaje(numero, factorial);
        mostrarMensaje(mensaje);
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static int calcularFactorial(int numero){
        int acumulador = 1;
        for(int i=1; i<=numero;i++){
            acumulador = acumulador*i;
        }
        return acumulador;
    }
    public static String generarMensaje(int numero, int factorial){
        String mensaje = "El factorial del numero " + numero + " es " + factorial ;
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }


}




