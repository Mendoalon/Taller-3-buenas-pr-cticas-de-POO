package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Songs> Myplaylists = new ArrayList<Songs>();
        
        MainLibrary  myLista = new MainLibrary();
        
        //System.out.println(myLista.defaultPlaylist());
        
        Myplaylists = myLista.defaultPlaylist();
        
        //System.out.println(myLista.filterSonGen("vallenato"));
        
        System.out.println( myLista.filterSonYear(1979));
        
    }
    
}
