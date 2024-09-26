package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private String descripcion;
    private int stock;
    private LocalDate fechaVencimiento;

    public Producto(String nombre, String codigo, double precio, String descripcion, int stock,
        LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descripcion="
                + descripcion + ", stock=" + stock + ", fechaVencimiento=" + fechaVencimiento + "]";
    }

    



    


    
}
