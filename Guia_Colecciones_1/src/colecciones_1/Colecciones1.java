/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones_1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Colecciones1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        ArrayList<String> razas = new ArrayList<>();

        String respuesta;
        
        //El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista

        do {
            System.out.println("Ingrese una raza de perro:");

            String raza = scanner.next();

            razas.add(raza);
            
            //después se le preguntará al usuario si quiere guardar otro perro o si quiere salir

            System.out.println("Desea ingresar otra raza?\nS/N");

            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("S"));
        
        //Si decide salir, se mostrará todos los perros guardados en el ArrayList

        for (String raza : razas) {
            
            System.out.println(raza);
        }
        
        

    }

}
