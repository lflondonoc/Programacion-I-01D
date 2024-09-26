package co.edu.uniquindio.poo;

import java.time.LocalTime;

public class Supermercado {
    private String nombre;
    private String telefono;
    private String direccion;
    private String id;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

public Supermercado(String nombre,String telefono, String direccion, String id, LocalTime horarioApertura, LocalTime horarioCierre){

    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
    this.id = id;
    this.horarioApertura = horarioApertura;
    this.horarioCierre = horarioCierre;

}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public LocalTime getHorarioApertura() {
    return horarioApertura;
}

public void setHorarioApertura(LocalTime horarioApertura) {
    this.horarioApertura = horarioApertura;
}

public LocalTime getHorarioCierre() {
    return horarioCierre;
}

public void setHorarioCierre(LocalTime horarioCierre) {
    this.horarioCierre = horarioCierre;
}

@Override
public String toString() {
    return "Supermercado [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", id=" + id
            + ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre + "]";
}



}
