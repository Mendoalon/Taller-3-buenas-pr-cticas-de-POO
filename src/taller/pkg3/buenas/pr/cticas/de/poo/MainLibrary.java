package taller.pkg3.buenas.pr.cticas.de.poo;

/**
 * Libreria que nos permitite durante el programa
 */
import java.util.ArrayList;
/**
 * Libreria que nos permite usar coleciones durante el programa
 */
import java.util.Collections;
/**
 * Libreria que nos permire utilizar la entrada por teclado durante el programa
 */
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
/**
 * Se crea clase mainLibrary si se implementa la interfaz MainLibraryInteface
 *
 */
public class MainLibrary implements MainLibraryInteface {

    /**
     * Creamos un campo de tipo playlist que es una instancia de un Arratlist
     * que tiene como parametros la clase Songs
     *
     * @param Songs
     */
    private ArrayList<Songs> playlists = new ArrayList<Songs>();
    /**
     * Incializamos la libreria Scanner y recibe por parametros una intrada por
     * teclado
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Creamos la biiblioteca principal y le asignamos valores de la clase songs
     *
     * @return playlist
     */
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

    /**
     * sobre escribimo el metodo showList y recoremos el arraylist de playlist y
     * imprimos sus valores
     *
     * @param songs
     */
    @Override
    public void showSongList(ArrayList<Songs> songs) {

        for (Songs playlist : songs) {
            System.out.println(playlist);
        }
    }

    /**
     * Sobrescribimos metodo filterSonGen y le pasamos como parametros la
     * playlist creada
     *
     * @param playList
     */
    @Override
    public void filterSonGen(ArrayList<Songs> playList) {
        /**
         * Se crea un parametro de tipo array llamado songGenre
         */
        ArrayList<Songs> songGenre = new ArrayList<Songs>();
        /**
         * Se le pide a al usuario el genero a filtrar
         */
        System.out.print("Ingrese el género de las canciones que desea ver: ");
        /**
         * a la variable genre le pasamos la informacion ingresada por el usario
         */
        String genre = scanner.nextLine();
        /**
         * Recorremos el array con los parametros de la clase Songs
         */
        playList.forEach((Songs song) -> {
            /**
             * Si el generero de la cancion en la plylist es igual a la varible
             * genre se agrega a la cancion al array
             */
            if (song.getGenre().contentEquals(genre)) {
                songGenre.add(song);
            }
        });
        /**
         * Si el array no se encuentra vacio se impreme las canciones que tenga
         * el mismo genereo ingresado por el usuario
         */
        if (songGenre.size() > 0) {
            songGenre.forEach((soung) -> {
                System.out.println(soung);
            });
            /**
             * En tal caso de no coincidencia o genero vacio se impreme la
             * leyenda de que no se encontro genero ingresado
             */
        } else {
            System.out.println("No se encuentra el genero ingresado.");
        }

    }

    /**
     * Sobrescribimos el metodo de filterSonYear cancion por año
     *
     * @param playList
     */
    @Override
    public void filterSonYear(ArrayList<Songs> playList) {
        /**
         * Se crea un parametro de tipo array llamado songYear
         */
        ArrayList<Songs> songYear = new ArrayList<Songs>();
        /**
         * Se obtiene el año que ingresa el usuario se maneja la excepcion en
         * caso de que se ingrese string
         */
        try {
            /**
             * Pedimos al usario el año a filtrar y se lo pasamos a la varible
             * yerars
             */
            System.out.print("Ingrese el año que desea filtrar: ");
            int years = scanner.nextInt();
            /**
             * Recorremos el array en tal caso que el año ingresado en la
             * playlist ((song.getYear()) se igual al año ingresado por el
             * usario agregamos al array las canciones con dicho año
             */
            playlists.forEach((Songs song) -> {
                if (song.getYear() == years) {
                    songYear.add(song);
                }
            });
            /**
             * Si el array no se encuntra vacio se imprime todas las caciones
             * que tengan el mismo año
             */
            if (songYear.size() > 0) {
                songYear.forEach((soung) -> {
                    System.out.println(soung);
                });
                /**
                 * En caso contrario se pasa la leyenda de genero no encontrado
                 */
            } else {
                System.out.println("No se encuentra el año ingresado.");
            }
            /**
             * Se maneja la excepcion de quue solo ingrese numero
             */
        } catch (Exception e) {
            System.out.println("Ingre el año en numeros.");
            scanner.next();
        }

    }

    /**
     * Sobre escribimos el genero SortDuration y utilizamos la funcion
     * collections pasamos la playlist y el metodo ComparebyDuration que nos
     * permite ordenar las canciones
     *
     * @param playList
     * @param CompareByDuration
     */
    @Override
    public void SortDuration(ArrayList<Songs> playList) {
        Collections.sort(playList, new CompareByDuration());
        /**
         * Recoremos el array y mostramos todas las canciones ordenadas desde la
         * mas corta a la mas larga
         */
        for (Songs songs : playList) {
            System.out.println(songs);
        }
    }

    /**
     * *
     * Sobre escribimos el genero SortDuration y la pasamos la playlist
     * utilizamos la funcion collections pasamos y el metodo CompaByDate que nos
     * permite ordenar las fechas de las canciones
     *
     * @param playList CompaByDate
     */
    @Override
    public void SortDate(ArrayList<Songs> playList) {
        Collections.sort(playList, new CompaByDate());
        /**
         * Recoremos el array y mostramos todas las canciones ordenadas desde la
         * mas reciente a la mas antigua
         */
        for (Songs songs : playList) {
            System.out.println(songs);
        }
    }

}
