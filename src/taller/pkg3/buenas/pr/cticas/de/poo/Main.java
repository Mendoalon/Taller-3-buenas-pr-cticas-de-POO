package taller.pkg3.buenas.pr.cticas.de.poo;

/**
 * Esta libreria nos permite manejar array durante el programa
 */
import java.util.ArrayList;
/**
 * Esta libreria nos permite capturar la excepciones ingresadas por teclado
 */
import java.util.InputMismatchException;
/**
 * Esta libreria nos permite recibir datos por teclado
 */
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Inicializamos la libreria escaner que recibe parametro por teclado
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * creamos un nuevo objeto de tipo Songs de tipo arraylist
         */
        ArrayList<Songs> myPlayLists = new ArrayList();
        /**
         * Creamos una instancia de la clase MainLibrary
         */
        MainLibrary myLista = new MainLibrary();
        /**
         * le asignamos al objeto de tipo arraylist todo lo que contiene
         * myLista.defaultPlaylist
         */
        myPlayLists.addAll(myLista.defaultPlaylist());
        /**
         * controlamos la opcion que ingrese el usario
         */
        int option;
        /**
         * Varible que permite salir del programa
         */
        boolean exit = false;
        /**
         * Imprimimos un menu incial de Bienvenida
         */
        System.out.println("==== Bienvenido a la aplicación Sofka Music ====");
        System.out.println("Aplicación donde podrá ver una  biblioteca de canciones.");
        /**
         * si la varible exit es false ejecutamos todo lo del While
         */
        while (!exit) {
            /**
             * Opciones a mostrar al usario
             */
            System.out.println("Menu:\n1. Mostrar todas las canciones de la biblioteca. \n2. Mostrar Canciones por género.");
            System.out.println("3. Mostrar Canciones por año de lanzamiento. \n4. Ordenar canciones por duración");
            System.out.println("5. Ordenar canciones por fecha. \n6. Para salir de la aplicación.");
            /**
             * Manejamos la excepcion de que usuario ingrese solo int
             */
            try {
                /**
                 * Pedimos que desea hacer el usuario y se lo pasamos a la
                 * varible option
                 */
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();
                /**
                 * Manejas Switch case para solo mostrar la informacion deseada
                 * por el usario
                 */
                switch (option) {

                    case 1:
                        /**
                         * mostramos toda las canciones de la biblioteca
                         */
                        myLista.showSongList(myPlayLists);
                        break;

                    case 2:
                        /**
                         * Filtramos las canciones con metodo filterSonGen
                         */
                        myLista.filterSonGen(myPlayLists);
                        break;

                    case 3:
                        /**
                         * Filtramos las canciones con metodo filterSonYear
                         */
                        myLista.filterSonYear(myPlayLists);
                        break;

                    case 4:
                        /**
                         * ordenamos las canciones por su duracion con el metodo
                         * SortDuration
                         */
                        myLista.SortDuration(myPlayLists);
                        break;

                    case 5:
                        /**
                         * ordenamos las canciones por su fecha con el metodo
                         * SortDate
                         */
                        myLista.SortDate(myPlayLists);
                        break;

                    case 6:
                        /**
                         * Mensaje de despedida del usario y converitmos en true
                         * a exit para que salga del while
                         */
                        System.out.println("¡Ha salido de la aplicación, vuelva pronto!");
                        exit = true;
                        break;

                    default:
                        /**
                         * controlamos que ingrese solo las opciones dadas
                         */
                        System.out.println("Las opciones son entre 1 y 6");

                }

            } catch (InputMismatchException e) {
                /**
                 * Exception para que el usario solo ingrese numeros
                 */
                System.out.println("Debe ingresar un número");
                scanner.next();
            }

        }

    }
}
