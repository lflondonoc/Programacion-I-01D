package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class ParImpar {
    
    public static void main(String[] args) {
        int numero= ingresarEntero ("Ingrese el número: ");
        String tipo = determinarNumero (numero);
        String mensaje= generarMensaje (numero, tipo);
        mostrarMensaje (mensaje);
    }

    public static int ingresarEntero (String mensaje){
        String dialogo = JOptionPane.showInputDialog(null, mensaje);
        return Integer.parseInt(dialogo);
    }

    public static String determinarNumero (int numero){
        String tipo;
        if (numero%2==0){
            tipo = " es par";
        }else{
            tipo = " es impar";
        }
        return tipo;
    }

    public static String generarMensaje (int numero, String tipo){
        String mensaje = "El "+numero+ tipo;
        return mensaje;
    }

    public static void mostrarMensaje (String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }    

}
