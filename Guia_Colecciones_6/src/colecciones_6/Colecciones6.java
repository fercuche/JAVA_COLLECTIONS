/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_6;

public class Colecciones6 {

   
    public static void main(String[] args) {
        
        ProductoService productos = new ProductoService();
        
        productos.menuCargarProducto();
        productos.mostrarProductos();
        productos.modificarPrecio();
        productos.eliminarProducto();
       
    }
    
}
