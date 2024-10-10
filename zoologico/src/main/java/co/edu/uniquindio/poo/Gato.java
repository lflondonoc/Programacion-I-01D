package co.edu.uniquindio.poo;

public class Gato extends Animal{

    public Gato(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }

    @Override
    public void dormir() {
        Animal.mostrarMensaje("Gato Zzzz.");
        
    }

    @Override
    public void hacerSonido() {
        Animal.mostrarMensaje("Miau miau");
        
    }

    @Override
    public String toString() {
        return "Gato:"+super.toString();
    }
    
}
