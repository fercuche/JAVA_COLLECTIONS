/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import colecciones_4.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Ferchu
 */
public class PeliculasOrdenAscendente implements Comparator<Pelicula>{
    
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return Float.compare(p1.getDuracion(), p2.getDuracion());
    }

    
}
