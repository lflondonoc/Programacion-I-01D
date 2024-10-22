package co.edu.uniquindio.poo;

public class Empleado extends Persona implements IEmpleado{
    private String direccion;

    // Constructor
    public Empleado(String nombre, String cedula, String correo, String telefono, String direccion){
        super(nombre, cedula, correo, telefono);
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método hacer tarea de empleado
    @Override
    public void hacerTarea() {
        System.out.println(getNombre() + " está vendiendo");
        
    }

    // ToString
    @Override
    public String toString() {
        return "Empleado:"+super.toString() + direccion;
    }
    
}
