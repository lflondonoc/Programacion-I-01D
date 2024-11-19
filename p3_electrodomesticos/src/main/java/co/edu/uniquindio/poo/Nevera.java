package co.edu.uniquindio.poo;

public class Nevera extends Electrodomestico {
    private TipoNevera tipo;

    public Nevera(String modelo, double precioBase, TipoNevera tipo) {
        super(modelo, precioBase);
        this.tipo = tipo;
    }

    /**
     * Metodo que permite calcular el precio de venta de la nevera
     */
    @Override
    public double calcularPrecioVenta() {
        double precioVenta = getPrecioBase();
        if (tipo == TipoNevera.INTELIGENTE) {
            precioVenta *= 1.30; 
        }
        return precioVenta;
    }

    @Override
    public String getTipo() {
        return "Nevera: " + tipo.name(); 
    }
}

