package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private double sueldo;

    public Empleado (String nombre, String cedula, String edad, double sueldo){
        super(nombre, cedula, edad);
        this.sueldo=sueldo;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", cedula=" + cedula + ", edad=" + edad + "]";
    }
    
}
