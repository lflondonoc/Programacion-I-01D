package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {

        // Crear objetos de electrodomésticos
        Nevera nevera1 = new Nevera("Modelo1", 800000, TipoNevera.CONVENCIONAL);
        Nevera nevera2 = new Nevera("Modelo2", 450000, TipoNevera.INTELIGENTE);
        Lavadora lavadora1 = new Lavadora("Modelo3", 400000);
        Lavadora lavadora2 = new Lavadora("Modelo4", 420000);

        // Crear una empresa y agregar los electrodomésticos
        Empresa empresa = new Empresa("UQ");
        empresa.agregarElectrodomestico(nevera1);
        empresa.agregarElectrodomestico(nevera2);
        empresa.agregarElectrodomestico(lavadora1);
        empresa.agregarElectrodomestico(lavadora2);

        //Inicialización del ciclo de lavado
        lavadora1.inicializacionCicloLavado();

        // Obtener el nombre del electrodoméstico más barato
        String modeloMasBarato = empresa.obtenerNombreElectrodomesticoMasBarato();
        System.out.println("El electrodoméstico más barato es: " + modeloMasBarato);

        // Mostrar el tipo de cada electrodoméstico
        System.out.println("Tipo de nevera1: " + nevera1.getTipo());
        System.out.println("Tipo de nevera2: " + nevera2.getTipo());
        System.out.println("Tipo de lavadora1: " + lavadora1.getTipo());
        System.out.println("Tipo de lavadora2: " + lavadora2.getTipo());

        // Llamar al método para obtener la nevera con precio más cercano al promedio
        String neveraCercanaAlPromedio = empresa.obtenerNeveraConPrecioCercanoMenorAlPromedio();
        System.out.println("La nevera con el precio por debajo del promedio es: " + neveraCercanaAlPromedio);
    }
}

