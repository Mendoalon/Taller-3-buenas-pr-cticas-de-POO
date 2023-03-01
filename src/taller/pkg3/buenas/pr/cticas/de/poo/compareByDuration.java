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
public class CompareByDuration implements Comparator<Songs> {

    /**
     * Se sobrescribe el metodo natural de comparator y se le pasa dos canciones
     * para comparar
     *
     * @param song1
     * @param song2
     * @return send
     */
    @Override
    public int compare(Songs song1, Songs song2) {
        /**
         * Variable que nos permite ordenar
         */
        int send = 0;
        /**
         * Si la cancion 1 tiene meyar duracion que la cancion 2 nuestra
         * variable para ordenar se convierte en 1
         */
        if (song1.getDuration() > song2.getDuration()) {
            send = 1;
            /**
             * en caso de la cancion 2 sea mas larga nustra variable send toma
             * valor negativo
             */
        } else if (song1.getDuration() < song2.getDuration()) {
            send = -1;
        }
        /**
         * Retornamos la canciones ordenadas
         */
        return send;
    }
}
