package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private double precioUnitario;
    private int stock;


    public Producto(String nombre, double precioUnitario, int stock) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock=stock;
    }


    public String getNombre() {
        return nombre;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
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
        return "Producto: " + nombre + ", precioUnitario=" + precioUnitario + ", stock=" + stock + "]";
    }

    public boolean reducirStockProducto(int cantidad){
        if (cantidad<=stock){
            stock -= cantidad;
            return true;
        }else{
            return false;
        }
    }


}
