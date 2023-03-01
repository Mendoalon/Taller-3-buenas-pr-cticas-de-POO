
package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.Comparator;

/**
 *
 * @author Lmendoza
 */
public class CompaByDate  implements Comparator<Songs>{
    private int multiplier; 

    public CompaByDate(boolean ascending) {
        if(ascending){
            multiplier = 1;
        }else{
            multiplier = -1;  
        }
    }
    
    
    
    @Override
    public int compare(Songs song1, Songs song2) {

        return multiplier * ( song1.getYear() - song2.getYear());
    }
    
}
