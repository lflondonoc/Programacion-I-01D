package co.edu.uniquindio.poo;

public class Perro extends Animal{
    
    public Perro(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }

    @Override
    public void dormir() {
        Animal.mostrarMensaje("Perro Zzzzz");
        
    }

    @Override
    public void hacerSonido() {
        Animal.mostrarMensaje("Gua gua");
        
    }

    @Override
    public String toString() {
        return "Perro:"+super.toString();
    }
}
