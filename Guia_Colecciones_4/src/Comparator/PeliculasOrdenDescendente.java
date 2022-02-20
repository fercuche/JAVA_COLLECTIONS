
package Comparator;

import colecciones_4.Pelicula;
import java.util.Comparator;

public class PeliculasOrdenDescendente implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return Float.compare(p2.getDuracion(), p1.getDuracion());
    }

    
    

}
