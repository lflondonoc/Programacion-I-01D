package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Tablas {
    public static void main(String[] args) {
        int numero1 = ingresarEntero("Ingrese el numero:  ");
        int numero2 = ingresarEntero("Ingrese el numero final: ");
        String tablas = calcularTablas(numero1, numero2);
        mostrarMensaje(tablas);
    }

    public static int ingresarEntero(String texto){
        String dialogo = JOptionPane.showInputDialog(null ,texto);
        return Integer.parseInt(dialogo);
    }

    public static String calcularTablas(int numeroInicial, int numeroFinal){
        String tabla = "Las tablas de "+ numeroInicial + " y "+ numeroFinal +" son: \n";

        for(int i = numeroInicial; i <= numeroFinal; i++){
            tabla += "La tabla del numero " + i + " es : \n";
            for (int j = 0; j <= 10;j+=2 ){
                int resultado = i*j;
                tabla += i + " X " + j +" = "+ resultado + "\n"; 
            }
        }
        return tabla;
    }

    public static void mostrarMensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }



    
}
