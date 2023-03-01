package taller.pkg3.buenas.pr.cticas.de.poo;

/**
 * Libreria que nos permite utilizar ArrayList durante el programa
 */
import java.util.ArrayList;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public interface MainLibraryInteface {

    /**
     * Array que nos permite crear la biblioteca principal
     *
     * @return playlist
     */
    public ArrayList defaultPlaylist();

    /**
     * Array que nos permite mostrar todas las canciones creadas
     *
     * @param songs
     */
    public void showSongList(ArrayList<Songs> songs);

    /**
     * Array para filtrar canciones por su genero
     *
     * @param playList
     */
    public void filterSonGen(ArrayList<Songs> playList);

    /**
     * Array para filtrar canciones por su año
     *
     * @param playList
     */
    public void filterSonYear(ArrayList<Songs> playList);

    /**
     * Array para ordenar las canciones por su duracion
     *
     * @param songs
     */
    public void SortDuration(ArrayList<Songs> songs);

    /**
     * Array para ordenar las canciones por su fecha
     *
     * @param songs
     */
    public void SortDate(ArrayList<Songs> songs);
}
