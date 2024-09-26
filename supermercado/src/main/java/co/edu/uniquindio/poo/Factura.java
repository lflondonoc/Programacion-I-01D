package co.edu.uniquindio.poo;

public class Factura {
    private String id;
    private String fecha;
    private double total;

    public Factura(String id, String fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

    

    
}
