
package Comparator;

import colecciones_4.Pelicula;
import java.util.Comparator;

public class PeliculasOrdenAlfabeticoTitulo implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
    }
    
    
}
