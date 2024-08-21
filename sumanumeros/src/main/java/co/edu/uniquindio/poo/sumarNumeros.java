package co.edu.uniquindio.poo;

public class sumarNumeros {

    public static final int A=7;
    public static final int B=8;
    public static void main(String[] args) {
     int suma = sumaNumeros (A,B);
     String mensaje = generarMensaje (A, B, suma);
     mostrarMensaje (mensaje);
    }

    public static int sumaNumeros(int a,int b){
        return a+b;
    }
    
    public static String generarMensaje (int a, int b, int suma){
        String mensaje= "La suma de "+a+" y "+b+" es igual a "+suma;
        return mensaje;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

}
