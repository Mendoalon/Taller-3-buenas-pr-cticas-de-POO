
package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;

/**
 *
 * @author Luis mendoza
 */
public class MainLibrary  implements MainLibraryInteface{
    private ArrayList<Songs> playlists = new ArrayList<Songs>();
    
    @Override
    public ArrayList defaultPlaylist() {
        
        return  playlists;
    }
    
}
