package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private double precioUnitario;


    public Producto(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }


    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    @Override
    public String toString() {
        return "Producto: " + nombre + ", precioUnitario=: " + precioUnitario;
    }
}
