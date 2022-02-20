/*
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package colecciones_4;

import Comparator.PeliculasOrdenAlfabeticoDirector;
import Comparator.PeliculasOrdenAlfabeticoTitulo;
import Comparator.PeliculasOrdenAscendente;
import Comparator.PeliculasOrdenDescendente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class PeliculasService {

    private ArrayList<Pelicula> peliculas;
    private Scanner scanner;

    public PeliculasService() {
        this.peliculas = new ArrayList<>();
        this.scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }

    public void crearPelicula(String titulo, String director, float duracion) {
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setDuracion(duracion);
        agregarPelicula(pelicula);
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public void cargarDatosPelicula() {
        System.out.println("Ingrese el título de la pelicula:");
        String titulo = scanner.next();
        System.out.println("Ingrese el nombre del director de la película:");
        String director = scanner.next();
        System.out.println("Ingrese la duracion en formato horas.minutos de la película:");
        float duracion = scanner.nextFloat();
        crearPelicula(titulo, director, duracion);
    }

    public void menuIngresarPeliculas() {
        String rta = "";
        do {
            if (this.peliculas.isEmpty()) {
                cargarDatosPelicula();
            } else {
                System.out.println("¿Desea cargar otra película?\nS/N");
                rta = this.scanner.next().toUpperCase();

                switch (rta) {
                    case "S":
                        cargarDatosPelicula();
                        break;
                    case "N":
                        System.out.println("La/s pelicula/s fue/ron añadida/s al sistema");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }
            }
        } while (!rta.equalsIgnoreCase("n"));

    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void pelisMayoresa1Hora() {
        System.out.println();
        System.out.println("-----Las pelis mayores a una hora son:-----");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void pelisOrdenadasPorDuracionAsc(){
        System.out.println("\nPeliculas ordenadas por duración\nen orden ascendente:\n");
        Collections.sort(peliculas, new PeliculasOrdenAscendente());
        mostrarPeliculas();
        
    }
    
    public void pelisOrdenadasPorDuracionDesc() {
        
        System.out.println("\nPeliculas ordenadas por duración\nen orden descendente:\n");
        Collections.sort(peliculas, new PeliculasOrdenDescendente());
        mostrarPeliculas();
    }

    public void pelisOrdenadasPorTitulo() {
        System.out.println("\nPelículas ordenadas alfabéticamente por título:\n");
        Collections.sort(peliculas, new PeliculasOrdenAlfabeticoTitulo());
        mostrarPeliculas();
    }

    public void pelisOrdenadasPorDirector() {
        System.out.println();
        System.out.println("\nPelículas ordenadas alfabéticamente por director:\n");
        Collections.sort(peliculas, new PeliculasOrdenAlfabeticoDirector());
        mostrarPeliculas();
    }

}
