package taller.pkg3.buenas.pr.cticas.de.poo;

/**
 * Libreria que nos permite utilizar la interfaz Comparator de javva
 */
import java.util.Comparator;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
/**
 * Implementamos en la clase la interfaz comparator y pasamos como parametros un
 * array de la clase songs
 */
public class CompaByDate implements Comparator<Songs> {

    /**
     * Comparamos la cancion y le pasamos dos canciones para que las compare y
     * ordene
     *
     * @param song1
     * @param song2
     * @return song
     */
    @Override
    public int compare(Songs song1, Songs song2) {

        return (song2.getYear() - song1.getYear());
    }

}
