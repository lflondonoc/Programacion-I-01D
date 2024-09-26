package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {
    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    public Gimnasio(String nombre, LocalDate fechaInscripcion){
        this.nombre=nombre;
        this.fechaInscripcion=fechaInscripcion;
        miembros= new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "El gimnasio tiene como nombre " + nombre + ", se inicia la fecha de Inscripcion el " + fechaInscripcion + ", y los miembros son: \n" + miembros+" los entrenadores son: \n"+entrenadores;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    // nombres invertidos
    public void imprimirNombresInvertidos() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            Gimnasio.mostrarMensaje(miembro.getNombre());
        }
    }
   
    // Obtener edades <18
    public LinkedList<Miembro> obtenerContactosMenoresEdad() {
        LinkedList<Miembro> menoresEdad = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menoresEdad.add(miembro);
            }
        }
        return menoresEdad;
    }
    //promedio de edades
    public double calcularPromedioEdades() {
        int sumaEdades = 0;
        int numeroMiembros = miembros.size();
    
        // Calcular la suma de todas las edades
        for (Miembro miembro : miembros) {
            sumaEdades += miembro.getEdad();
        }
        
        // Calcular el promedio de edades
        double promedioEdades = 0;
        if (numeroMiembros > 0) {
            promedioEdades = sumaEdades / numeroMiembros;
        }
    
        return promedioEdades;
    }

    
    // Eliminar miembros que los nombres tengan 3 vocales
    public void eliminarMiembrosCon3Vocales() {
        for (int i = 0; i < miembros.size(); i++) {
            Miembro miembro = miembros.get(i);
            String nombre = miembro.getNombre();

            if (contarVocales(nombre) >= 3) {
                miembros.remove(i);
                i--; // Ajustar el índice después de la eliminación para evitar errores
            }
        }
    }
    public static boolean isVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static int contarVocales(String palabra) {
        int cont = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (isVocal(letra)) {
                cont++;
            }
        }
        return cont;
    }

    

    // Obtener edad mas común
    public int obtenerEdadMasRepetida() {
        int edadMasRepetida = miembros.get(0).getEdad();
        int maxFrecuencia = 0;

        for (Miembro miembro1 : miembros) {
            int edad = miembro1.getEdad();
            int frecuencia = 0;

            for (Miembro miembro2 : miembros) {
                if (miembro2.getEdad() == edad) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                edadMasRepetida = edad;
            }
        }

        return edadMasRepetida;
    }

    public void agregarMiembro(Miembro miembro){
        miembros.add(miembro);
    }

    public void agregarEntrenador(Entrenador entrenador){
        entrenadores.add(entrenador);
    }

    //------------Parcial 1---------------------
    //Método que devuelva el nombre más largo entre todos los entrenadores
    public String obtenerNombreEntrenadorMasLargo() {
        String nombreMasLargo = entrenadores.get(0).getNombre();
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().length() > nombreMasLargo.length()) {
                nombreMasLargo = entrenador.getNombre();
            }
        }
        return nombreMasLargo;
    }

    // Método que imprime los entrenadores cuya suma de teléfono es igual a 30
    public LinkedList<Entrenador> agregarEntrenadorConSumaTelefono30() {
        LinkedList<Entrenador> entrenadoresConSuma30 = new LinkedList<>();
        
        for (Entrenador entrenador : entrenadores) {
            int telefono = entrenador.getTelefono();  // Obtiene el número de teléfono
            int sumaDigitos = 0;
            
            // Suma los dígitos del número de teléfono usando un bucle for
            for (int i = telefono; i > 0; i /= 10) {
                sumaDigitos += i % 10;  // Obtiene el dígito menos significativo
            }
            
            // Verifica si la suma de los dígitos es igual a 30
            if (sumaDigitos == 30) {
                entrenadoresConSuma30.add(entrenador);
            }
        }
        return entrenadoresConSuma30;
    }
    //Método que agregue a una lista los nombres de los miembros que son palíndromos
    public LinkedList<Miembro> agregarMiembrosPalindromos() {
        LinkedList<Miembro> miembrosPalindromos = new LinkedList<>();
        for (Miembro miembro : miembros) {
            String nombre = miembro.getNombre();
            int longitud = nombre.length();
            boolean esPalindromo = true;
    
            // Verificar si el nombre es un palíndromo (sin normalización de minúsculas)
            for (int i = 0; i < longitud / 2; i++) {
                if (nombre.charAt(i) != nombre.charAt(longitud - i - 1)) {
                    esPalindromo = false;
                    break;
                }
            }
    
            if (esPalindromo) {
                miembrosPalindromos.add(miembro); 
            }
        }
        return miembrosPalindromos;
    }


    //------------Parcial 1---------------------


}
