package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.Comparator;

/**
 *
 * @author JAIME
 */
public class compareByDuration implements Comparator <Songs> {
    private float multiplicator;
    /**
    public compareByDuration(boolean ascending) {
        if(ascending){
            multiplicator=1;
        }else{
            multiplicator= -1;
        }
    }**/

    @Override
    public int compare(Songs songs1, Songs songs2) {
        int retorn = 0;
        if(songs1.getDuration() > songs2.getDuration()){
        retorn = 1;
        }else if(songs1.getDuration()<songs2.getDuration()){
        retorn = -1;
        }
        return retorn;
    }    
}
