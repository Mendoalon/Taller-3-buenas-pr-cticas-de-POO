package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class MainLibrary implements MainLibraryInteface {
    private ArrayList<Songs> playlists = new ArrayList<Songs>();
    

    @Override
    public ArrayList defaultPlaylist() {
        
        playlists.add(new Songs(1, "Discovering the Waterfront", 13, 03, 2021, 3.35F, "pop", "love.jpg  ", "description 1"));
        playlists.add(new Songs(2, "Oh  my  Love", 9, 9, 2005, 3.81F, "pop", "JhonL.jpg", "description 2"));
        playlists.add(new Songs(3, "Beat It", 22, 3, 1982, 4.58F, "pop      ", "Michael Jackson", "description 3"));
        playlists.add(new Songs(4, "Despacito", 12, 1, 2017, 3.22F, "reggeaton", "Fonsy.jpg", "description 4"));
        playlists.add(new Songs(5, "Oye", 12, 1, 2017, 4.21F, "hip-Hop", "vico C.jpg", "description 5"));
        playlists.add(new Songs(6, "Pump It Harder", 17, 1, 2006, 2.01F, "hip-hop", "Black Eyed Peas.jpg", "description 6"));
        playlists.add(new Songs(7, "Without Me", 2, 6, 2002, 4.57F, "hip-hop", "Eminem.jpg", "description 7"));
        playlists.add(new Songs(8, "Still D.R.E.", 16, 11, 2001, 4.54F, "hip-hop", "Dr. Dre", "description 8"));
        playlists.add(new Songs(9, "Lo grande que es perdonar", 22, 6, 2005, 4.41F, "pop      ", "Vico+Santa.jpg", "description 9"));
        playlists.add(new Songs(10, "Let There Be Rock", 27, 7, 1977, 6.09F, "rock", "AC-DC.jpg", "description 10"));
        playlists.add(new Songs(11, "Stairway to Heaven", 18, 12, 1970, 8.06F, "rock", "Led Zeppelin.jpg", "description 11"));
        playlists.add(new Songs(12, "Bohemian Rhapsody", 19, 7, 1974, 5.55F, "rock", "Queen.jpg", "description 12"));
        playlists.add(new Songs(13, "November Rain", 27, 11, 1990, 8.57F, "rock", "Guns N' Roses.jpg", "description 13"));
        playlists.add(new Songs(14, "El Cepillo", 21, 11, 1997, 4.22F, "merengue", "Fulanito.jpg", "description 14"));
        playlists.add(new Songs(15, "Abusadora", 13, 4, 2016, 4.49F, "merengue", "Oro Solido.jpg", "description 15"));
        playlists.add(new Songs(16, "Tu Eres Ajena", 14, 9, 2001, 4.53F, "merengue", "Eddy Herrera.jpg", "description 16"));
        playlists.add(new Songs(17, "Ella Es Tan Bella", 9, 2, 2007, 4.23F, "merengue", "Rikarena.jpg", "description 17"));
        playlists.add(new Songs(18, "Busca Por Dentro", 8, 6, 1990, 5.54F, "salsa", "Grupo Niche.jpg", "description 18"));
        playlists.add(new Songs(19, "El Cantante", 26, 1, 1998, 10.20F, "salsa", "Hector Lavoe.jpg", "description 19"));
        playlists.add(new Songs(20, "Pedro Navaja", 1, 1, 1983, 7.22F, "salsa", "Willie Colon-Ruben Blades.jpg", "description 20"));
        playlists.add(new Songs(21, "Esos Ojitos Negros", 20, 4, 1987, 4.34F, "salsa", "El Gran Combo de Puerto Rico.jpg", "description 21"));

        return playlists;
        

    }
    
     @Override
    public void showSongList(ArrayList<Songs> songs) {
        
        for (Songs playlist : songs) {
            System.out.println(playlist);
        }
        
    }

    @Override
    public ArrayList<Songs> filterSonGen(String genre, ArrayList<Songs> playList ) {
          ArrayList<Songs> songGenre = new ArrayList<Songs>();
    
       
        
        
        playList.forEach((Songs song) -> {
            if (song.getGenre().contentEquals(genre)) {
                songGenre.add(song);
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

    @Override
    public void SortDuration(ArrayList<Songs> songDuration) {
        Collections.sort(songDuration, new compareByDuration());
        
        for (Songs songs : songDuration) {
            System.out.println(songs);
        }
        
    }
    
    @Override
    public void SortDate(ArrayList<Songs> songDate) {
        Collections.sort(songDate, new CompaByDate());

        for (Songs songs : songDate) {
            System.out.println(songs);
        }
    }
        
}


