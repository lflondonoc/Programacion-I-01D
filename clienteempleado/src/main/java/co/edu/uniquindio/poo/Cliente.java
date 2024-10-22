package co.edu.uniquindio.poo;

public class Cliente extends Persona implements ICliente{

    private String descuento;
    
    // Constructor
    public Cliente(String nombre, String cedula, String correo, String telefono, String descuento){
        super(nombre, cedula, correo, telefono);
        this.descuento = DESCUENTO;
    }
    
    // Método comprar de cliente
    @Override
    public void comprar() {
        System.out.println(getNombre() + " está comprando");
    }

    // ToString
    @Override
    public String toString() {
        return "Cliente: " + super.toString() + " descuento: " + descuento;
    }
}
