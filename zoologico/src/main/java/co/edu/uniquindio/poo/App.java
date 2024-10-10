package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Perro perro= new Perro("Milú", 12, 10.5);
        Gato gato = new Gato("Mia", 5, 3);

        boolean menu= true;
        while (menu) {
            Animal.mostrarMensaje("Bienvenidos:\n");
            int animalSeleccionado= Animal.ingresarEntero("Seleccione la mascota: \n1.Perro \n2.Gato \n3.Salir del programa.\n");

            switch (animalSeleccionado) {
                case 1:
                    Animal.mostrarMensaje("Ha seleccionado el perro "+perro.getNombre());
                    interaccion(perro);
                    break;
                case 2:
                    Animal.mostrarMensaje("Ha seleccionado el gato "+gato.getNombre());
                    interaccion(gato);
                    break;
                case 3:
                    menu= false;
                    Animal.mostrarMensaje("Saliendo del programa....");
                    break;
                default:
                    Animal.mostrarMensaje("Error, ingrese una opción válida");
                    break;
            }
            Animal.mostrarMensaje("------------------------");
        }
    }
    public static void interaccion(Animal animal){
        boolean menuInteraccion= true;
        while (menuInteraccion) {
            int acciones= Animal.ingresarEntero("Seleccione una de las siguientes opciones que quiere que haga "+animal.getNombre()+"\n1.Dormir \n2.Comer \n3.Hacer sonido \n.Volver al menú principal.\n");

            switch (acciones) {
                case 1:
                    animal.dormir();
                    break;
                case 2:
                    animal.comer();
                    break;
                case 3:
                    animal.hacerSonido();
                    break;
                case 4:
                    menuInteraccion=false;
                    Animal.mostrarMensaje("Volviendo al menú principal....");
                    break;
                default:
                    Animal.mostrarMensaje("Error, ingrese una opción válida");
                    break;
            }
        }
    }
}
