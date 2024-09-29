package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        
        // Crear el supermercado
        Supermercado supermercado = new Supermercado("Laureles");

        // Crear cliente y empleado
        Cliente cliente = new Cliente("Juan", "", "123", "", "","");
        Trabajador empleado = new Trabajador("Pedro", "", "", "", "", "", "");

        // Crear productos
        Producto producto = new Producto("Pera", 800);
        Producto producto2 = new Producto("Manzana", 1000);

        // Agregar cliente, empleado y productos al supermercado
        supermercado.agregarCliente(cliente);
        supermercado.agregarEmpleado(empleado);
        supermercado.agregarProducto(producto);
        supermercado.agregarProducto(producto2);

        // Crear la factura (sin total aún)
        Factura factura = new Factura("001");

        // Crear un detalle de factura y agregarlo a la factura
        DetalleFactura detalleFactura = new DetalleFactura(2, producto); // 2 peras por 800 cada una
        factura.agregarDetalleFactura(detalleFactura);

        DetalleFactura detalleFactura2 = new DetalleFactura(3, producto2); // 3 manzanas por 1000 cada una
        factura.agregarDetalleFactura(detalleFactura2);

        // Mostrar el mensaje del supermercado
        Supermercado.mostrarMensaje(supermercado.toString());

        // Calcular y mostrar el subtotal de los detalles
        double totalDetalle = detalleFactura.calcularSubtotal(producto);
        double totalDetalle2 = detalleFactura2.calcularSubtotal(producto2);
        Supermercado.mostrarMensaje("El subtotal del primer detalle es: " + totalDetalle);
        Supermercado.mostrarMensaje("El subtotal del segundo detalle es: " + totalDetalle2);

        // Calcular el total de la factura sumando todos los detalles
        double totalFactura = factura.calcularTotal();
        Supermercado.mostrarMensaje("El total de la factura es: " + totalFactura);
        Supermercado.mostrarMensaje(factura.toString());
    }
}
