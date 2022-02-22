
package colecciones_5;

import java.util.Comparator;


public class OrdenarAlfabeticamente implements Comparator<Pais> {

    @Override
    public int compare(Pais p1, Pais p2) {
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }
    
    
}
