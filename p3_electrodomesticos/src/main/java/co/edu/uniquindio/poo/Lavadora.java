package co.edu.uniquindio.poo;

public class Lavadora extends Electrodomestico implements IEmpresaAlterna{

    public Lavadora(String modelo, double precioBase) {
        super(modelo, precioBase);
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase() * 1.15;
    }

    @Override
    public String getTipo() {
        return "Lavadora";
    }

    @Override
    public void inicializacionCicloLavado() {
        System.out.println("Iniciando ciclo de lavado");
        
    }
    
}

