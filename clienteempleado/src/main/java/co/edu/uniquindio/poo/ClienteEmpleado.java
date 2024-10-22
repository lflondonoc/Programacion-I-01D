package co.edu.uniquindio.poo;

public class ClienteEmpleado extends Cliente implements IEmpleado, ICliente{

    public ClienteEmpleado(String nombre, String cedula, String correo, String telefono){
        super(nombre, cedula, correo, telefono);
    }

    @Override
    public void hacerTarea() {
        System.out.println(getNombre() + " guarda los productos");
    }

    @Override
    public void comprar() {
        System.out.println(getNombre() + " compra una botella de agua");
    }

    @Override
    public String toString() {
        return "ClienteEmpleado: " + super.toString();
    }

    
}
