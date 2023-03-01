package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.Comparator;

/**
 *
 * @author JAIME
 */
public class compareByDuration implements Comparator <Songs> {
    private float multiplicator;

    public compareByDuration(boolean ascending) {
        if(ascending){
            multiplicator=1;
        }else{
            multiplicator=2;
        }
    }

    
    
    @Override
    public int compare(Songs songs1, Songs songs2) {
        
        return (int) (multiplicator*(songs1.getDuration()-songs2.getDuration()));
        
    }
    
}
