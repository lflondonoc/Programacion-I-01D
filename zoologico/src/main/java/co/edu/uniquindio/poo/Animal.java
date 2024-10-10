package co.edu.uniquindio.poo;

import java.util.Scanner;

public abstract class Animal {
    public String nombre;
    public int edad;
    public double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Animal: " + nombre + ", edad: " + edad + ", peso: " + peso;
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public void comer(){
        mostrarMensaje("Los animales comen a las 12:00 M");
    }

    public abstract void dormir();

    public abstract void hacerSonido();
}
