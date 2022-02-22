/*
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package colecciones_6;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    private HashMap<String, Float> productos;
    private Scanner scanner;

    public ProductoService() {
        this.scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.productos = new HashMap<>();
    }

    public void cargarProducto() {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el precio del producto: ");
        float precio = scanner.nextFloat();
        crearProducto(nombre, precio);
    }

    public void crearProducto(String nombre, float precio) {
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        agregarProducto(producto);
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombre(), producto.getPrecio());
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            System.out.println("nombre= " + entry.getKey() + ", precio= $"
                    + entry.getValue());
        }
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el prodcuto a modificar: ");
        String producto = scanner.next();
        System.out.println("Ingrese el nuevo precio del producto: ");
        float nuevoPrecio = scanner.nextFloat();
        productos.put(producto, nuevoPrecio);
        mostrarProductos();
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar: ");
        String producto = scanner.next();
        productos.remove(producto);
        mostrarProductos();
    }
    
    public void menuCargarProducto() {
        String rta = "";
        do {
            if (this.productos.isEmpty()) {
                cargarProducto();
            } else {
                System.out.println("¿Desea cargar otro producto?\nS/N");
                rta = this.scanner.next().toUpperCase();

                switch (rta) {
                    case "S":
                        cargarProducto();
                        break;
                    case "N":
                        System.out.println("La operacion se realizó de forma exitosa");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }
            }
        } while (!rta.equalsIgnoreCase("n"));

    }

}
