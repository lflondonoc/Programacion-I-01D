package co.edu.uniquindio.poo;

public abstract class Electrodomestico {
    private String modelo;
    private double precioBase;

    /**
     * Metodo constructor de la clase Electrodomestico
     * @param modelo
     * @param precioBase
     */
    public Electrodomestico(String modelo, double precioBase) {
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    /**
     * Método abstracto para calcular el precio de venta
     * @return
     */
    public abstract double calcularPrecioVenta();

    /**
     * Método para obtener el tipo de electrodoméstico
     * @return
     */
    public abstract String getTipo();

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
