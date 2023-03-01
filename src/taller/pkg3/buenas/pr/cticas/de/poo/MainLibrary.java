package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class MainLibrary implements MainLibraryInteface {

    private ArrayList<Songs> playlists = new ArrayList<Songs>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public ArrayList defaultPlaylist() {

        playlists.add(new Songs(1, "Blinding Lights", 29, 11, 2019, 4.26f, "pop", "Blinding Lights.png", "cancion de the weekend"));
        playlists.add(new Songs(2, "Shape of You", 06, 01, 2017, 3.26f, "pop", "Shape of You.png", "cancion de Ed Sherman con mas 4 milones de vistas"));
        playlists.add(new Songs(3, "That's What I Like", 18, 11, 2016, 4.20f, "pop", "That's What I Like.png", "cancion de Bruno Mars para su album 24K Magic"));
        playlists.add(new Songs(4, "Yandel 150", 25, 01, 2023, 3.45f, "regueton", "Ynadel150.png", "el nuevo duo dinamico se junta en este nuevo tema"));
        playlists.add(new Songs(5, "Dont Stop Me Now", 26, 01, 1979, 2.26f, "Jazz", "Dont Stop Me Now.png", "la nueva cancion de Queen"));
        playlists.add(new Songs(6, "En el dia 300", 12, 10, 2017, 3.27f, "vallenato", "en el dia 300.png", "cancion que habla del desamor"));
        playlists.add(new Songs(7, "Despacito", 23, 03, 2017, 5.26f, "pop", "Despacito.png", "cancion de  Fonsi ft Daddy Yankee"));
        playlists.add(new Songs(8, "Algo que se quede", 18, 01, 2018, 3.30f, "salsa", "Algo que se quede.png", "cancion de la nueva era del grupo niche"));
        playlists.add(new Songs(9, "procura", 15, 07, 1997, 4.08f, "salsa", "procura.png", "cancion de amor de el chichi peralta"));
        playlists.add(new Songs(10, "Ojitos lindos", 29, 12, 2020, 3.34f, "regueton", "Ojitos lindos.png", "cancion de el nuevo album un verano sin ti"));
        playlists.add(new Songs(11, "Stairway to Heaven", 18, 12, 1970, 8.06F, "rock", "Led Zeppelin.jpg", "description 11"));
        playlists.add(new Songs(12, "Bohemian Rhapsody", 19, 7, 1974, 5.55F, "rock", "Queen.jpg", "description 12"));
        playlists.add(new Songs(13, "November Rain", 27, 11, 1990, 8.57F, "rock", "Guns N' Roses.jpg", "description 13"));
        playlists.add(new Songs(14, "El Cepillo", 21, 11, 1997, 4.22F, "merengue", "Fulanito.jpg", "description 14"));
        playlists.add(new Songs(15, "Abusadora", 13, 4, 2016, 4.49F, "merengue", "Oro Solido.jpg", "description 15"));

        return playlists;

    }

    @Override
    public void showSongList(ArrayList<Songs> songs) {

        for (Songs playlist : songs) {
            System.out.println(playlist);
        }
    }

    @Override
    public void filterSonGen(ArrayList<Songs> playList) {
        ArrayList<Songs> songGenre = new ArrayList<Songs>();

        System.out.print("Ingrese el género de las canciones que desea ver: ");
        String genre = scanner.nextLine();

        playList.forEach((Songs song) -> {
            if (song.getGenre().contentEquals(genre)) {
                songGenre.add(song);
            }
        });

        if (songGenre.size() > 0) {
            songGenre.forEach((soung) -> {
                System.out.println(soung);
            });
        } else {
            System.out.println("No se encuentra el genero ingresado.");
        }

    }

    @Override
    public void filterSonYear(ArrayList<Songs> playList) {
        ArrayList<Songs> songYear = new ArrayList<Songs>();

        try {
            System.out.print("Ingrese el año que desea filtrar: ");
            int years = scanner.nextInt();

            playlists.forEach((Songs song) -> {
                if (song.getYear() == years) {
                    songYear.add(song);
                }
            });

            if (songYear.size() > 0) {
                songYear.forEach((soung) -> {
                    System.out.println(soung);
                });
            } else {
                System.out.println("No se encuentra el año ingresado.");
            }

        } catch (Exception e) {
            System.out.println("Ingre el año en numeros.");
            scanner.next();
        }

    }

    @Override
    public void SortDuration(ArrayList<Songs> playList) {
        Collections.sort(playList, new CompareByDuration());

        for (Songs songs : playList) {
            System.out.println(songs);
        }
    }

    @Override
    public void SortDate(ArrayList<Songs> playList) {
        Collections.sort(playList, new CompaByDate());

        for (Songs songs : playList) {
            System.out.println(songs);
        }
    }

}
