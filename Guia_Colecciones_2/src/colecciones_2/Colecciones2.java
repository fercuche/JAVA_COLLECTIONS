/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.

 */
package colecciones_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Colecciones2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        ArrayList<String> razas = new ArrayList<>();

        String respuesta;

        do {
            System.out.println("Ingrese una raza de perro:");

            String raza = scanner.next();

            razas.add(raza);

            System.out.println("Desea ingresar otra raza?\nS/N");

            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("s"));

        for (String raza : razas) {

            System.out.println(raza);
        }

        //al usuario se le pedirá un perro
        
        System.out.println("Ingrese una raza para buscar en la lista:");

        String perro = scanner.next();

        //se recorrerá la lista con un Iterator, se buscará el perro en la lista
        //se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada.
        //Si el perro no se encuentra en la lista, se le informará al usuarioy se mostrará la lista ordenada.

        Iterator<String> it = razas.iterator();
        boolean bandera = false;

        while (it.hasNext()) {

            if (it.next().equalsIgnoreCase(perro)) {

                it.remove();
                bandera = true;
            }
        }

        if (bandera == false) {
            System.out.println("La raza no se encuentra en la lista");
        }

        System.out.println("-----------------------------");
        System.out.println("Lista ordenanda:");
        
        //ordenar lista
        Collections.sort(razas);
        
        System.out.println(razas.toString());

        for (String raza : razas) {

            System.out.println(raza);
        }
        
        System.out.println("-----------------------------");
        
        
    }

}
