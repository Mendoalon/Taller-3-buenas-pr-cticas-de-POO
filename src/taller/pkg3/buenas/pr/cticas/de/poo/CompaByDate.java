
package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.Comparator;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class CompaByDate  implements Comparator<Songs>{
  
    @Override
    public int compare(Songs song1, Songs song2) {

        return   (song2.getYear() - song1.getYear());
    }
    
}
