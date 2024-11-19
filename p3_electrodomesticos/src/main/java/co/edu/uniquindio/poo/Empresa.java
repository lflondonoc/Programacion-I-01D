package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList<Electrodomestico> electrodomesticos;

    public Empresa(String nombre) {
        this.nombre=nombre;
        electrodomesticos = new LinkedList<>();
    }

    /**
     * PUNTO 3: Método que permite obtener el nombre del electrodoméstico más barato.
     * @return
     */
    public String obtenerNombreElectrodomesticoMasBarato() {
        if (electrodomesticos.size() == 0) {
            return "No hay electrodomésticos disponibles";
        }
        Electrodomestico electrodomesticoMasBarato = electrodomesticos.get(0);
        double precioMasBarato = electrodomesticoMasBarato.calcularPrecioVenta();

        for (int i = 1; i < electrodomesticos.size(); i++) {
            Electrodomestico electrodomestico = electrodomesticos.get(i);
            double precioVenta = electrodomestico.calcularPrecioVenta();
            if (precioVenta < precioMasBarato) {
                precioMasBarato = precioVenta;
                electrodomesticoMasBarato = electrodomestico;
            }
        }
        return electrodomesticoMasBarato.getModelo();
    }

    /**
     * PUNTO 4: Método que permite agregar a una lista los nombres de los electrodomésticos "neveras"
     * cuyo precio de venta sea menor al promedio de los precios de venta de todos los electrodomésticos de tipo nevera.
     * @return
     */
    public String obtenerNeveraConPrecioCercanoMenorAlPromedio() {
        double sumaPrecios = 0;
        int contadorNeveras = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico.getClass() == Nevera.class) {
                sumaPrecios += electrodomestico.calcularPrecioVenta();
                contadorNeveras++;
            }
        }

        if (contadorNeveras == 0) {
            return "No hay neveras registradas";
        }

        double promedio = sumaPrecios / contadorNeveras;
        String modeloCercano = "";
        double diferenciaMinima = -1;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico.getClass() == Nevera.class) {
                double precioVenta = electrodomestico.calcularPrecioVenta();
                double diferencia = precioVenta - promedio; 

                if (diferenciaMinima == -1 || diferencia < diferenciaMinima) {
                    diferenciaMinima = diferencia;
                    modeloCercano = electrodomestico.getModelo();
                }
            }
        }
        return modeloCercano;
    }

    /**
     * Método que permite agregar electrodoméstico a la lista de electrodomesticos  
     * @param electrodomestico
     */
    public void agregarElectrodomestico(Electrodomestico electrodomestico) {
        electrodomesticos.add(electrodomestico);
    }

}
