package co.edu.uniquindio.poo;

public class DetalleFactura {
    private String id;
    private int cantidad;
    private double subTotal;
    Producto producto;

public DetalleFactura(String id, int cantidad, Producto producto) {
    this.id = id;
    this.cantidad = cantidad;
    this.subTotal = calcularSubTotal(producto);
    this.producto = producto;
    }

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public int getCantidad() {
    return cantidad;
}

public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

public double getSubTotal() {
    return subTotal;
}

public void setSubTotal(double subTotal) {
    this.subTotal = subTotal;
}

public Producto getProducto() {
    return producto;
}

public void setProducto(Producto producto) {
    this.producto = producto;
}

public double calcularSubTotal(Producto producto){
    double subTotal = 0;
    subTotal = cantidad * producto.getPrecio();
    return subTotal;
}


    
    
}
