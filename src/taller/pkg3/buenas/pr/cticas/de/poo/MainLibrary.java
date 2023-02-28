package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;


/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class MainLibrary implements MainLibraryInteface {

    private ArrayList<Songs> playlists = new ArrayList<Songs>();

    @Override
    public ArrayList defaultPlaylist() {
        playlists.add(new Songs(1, "Blinding Lights", 29, 11, 2019, 4.26f, "pop", "Blinding Lights.png", "cancion de the weekend"));
        playlists.add(new Songs(2, "Shape of You", 06, 01, 2017, 3.26f, "pop", "Shape of You.png", "cancion de Ed Sherman con mas 4 milones de vistas"));
        playlists.add(new Songs(3, "That's What I Like", 18, 11, 2016, 4.20f, "pop", "That's What I Like.png", "cancion de Bruno Mars para su album 24K Magic"));
        playlists.add(new Songs(4, "Yandel 150", 25, 01, 2023, 3.26f, "regueton", "Ynadel150.png", "el nuevo duo dinamico se junta en este nuevo tema"));
        playlists.add(new Songs(5, "Dont Stop Me Now", 26, 01, 1979, 2.26f, "Jazz", "Dont Stop Me Now.png", "la nueva cancion de Queen"));
        playlists.add(new Songs(6, "En el dia 300", 12, 10, 2017, 3.27f, "vallenato", "en el dia 300.png", "cancion que habla del desamor"));
        playlists.add(new Songs(7, "Despacito", 23, 03, 2017, 5.26f, "pop", "Despacito.png", "cancion de  Fonsi ft Daddy Yankee"));
        playlists.add(new Songs(8, "Algo que se quede", 18, 01, 2018, 3.30f, "salsa", "Algo que se quede.png", "cancion de la nueva era del grupo niche"));
        playlists.add(new Songs(9, "procura", 15, 07, 1997, 5.26f, "salsa", "procura.png", "cancion de amor de el chichi peralta"));
        playlists.add(new Songs(10, "Ojitos lindos", 29, 12, 2020, 3.34f, "regueton", "Ojitos lindos.png", "cancion de el nuevo album un verano sin ti"));
        return playlists;
    }

    @Override
    public ArrayList filterSonGen(String genre) {
         ArrayList<String> songGenre = new ArrayList<String>();
        playlists.forEach((Songs song) -> {
            if (song.getGenre().contentEquals(genre)) {
                songGenre.add(song.toString());
            }
        });
        return songGenre;
    }
    
    @Override
    public ArrayList filterSonYear(int year) {
        ArrayList<Songs> songYear = new ArrayList<Songs>();

        playlists.forEach((Songs song) -> {
            if (song.getYear() == year) {
                songYear.add(song);
            }
        });
        
        return songYear;
    }
    

}

