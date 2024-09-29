package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Supermercado {
    private String nombre;
    LinkedList<Cliente> clientes;
    LinkedList<Trabajador> trabajadores;
    LinkedList<Producto> productos;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        clientes= new LinkedList<>();
        trabajadores= new LinkedList<>();
        productos= new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Supermercao:" + nombre + ", clientes: " + clientes + ", trabajadores: " + trabajadores + ", productos: "
                + productos;
    }

    public void agregarCliente (Cliente cliente){
        clientes.add(cliente);
    }

    public void agregarEmpleado (Trabajador trabajador){
        trabajadores.add(trabajador);
    }

    public void agregarProducto (Producto producto){
        productos.add(producto);
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
}
