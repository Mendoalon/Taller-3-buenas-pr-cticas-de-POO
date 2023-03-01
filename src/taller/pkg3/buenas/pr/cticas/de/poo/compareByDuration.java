package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.Comparator;

/**
 *
 * @author JAIME
 */
public class compareByDuration implements Comparator <Songs> {
    
    @Override
    public int compare(Songs song1, Songs song2) {
        int send = 0;
        if(song1.getDuration() > song2.getDuration()){
        send = 1;
        }else if(song1.getDuration() < song2.getDuration()){
        send = -1;
        }
        return send;
    }    
}
