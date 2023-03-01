package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<Songs> Myplaylists = new ArrayList<>();
<<<<<<< HEAD
        MainLibrary myList = new MainLibrary();
        Scanner input = new Scanner(System.in);
        int option;
        do {
            option = 0;
            System.out.println("LOGIN EXITOSO");
            System.out.println("=======================");
            System.out.println("Presione el numero segun su opcion de preferencia");
            System.out.println("1. Mostrar toda la biblioteca");
            System.out.println("2. Filtrar sus canciones por genero especifico");
            System.out.println("3. Filtrar cancion por el anio de lanzamiento");
            System.out.println("4. Ordenar cacanciones por su duracion");
            System.out.println("5. Ordenar las canciones segun su fecha");
            System.out.println("0. para salir");
            System.out.print("Digite la opcion de su preferencia: ");
            option = input.nextInt();
            switch (option) {
                case 1 -> System.out.println(myList.defaultPlaylist());
                case 2 -> System.out.println(myList.filterSonGen("pop"));
                case 3 -> System.out.println(myList.filterSonYear(1956));
                case 4 -> System.out.println(myList.orderByduration());
                case 5 -> System.out.println("");
                default -> System.out.println("opcion no encontrada");
            }

        } while (option != 0);
=======

        MainLibrary myLista = new MainLibrary();

       myLista.defaultPlaylist();

        //Myplaylists = myLista.defaultPlaylist();
        //System.out.println(myLista.filterSonGen("vallenato"));
        //System.out.println( myLista.filterSonYear(1979));
        //myLista.orderByduration();
        
        myLista.SortDate();
>>>>>>> d967e9fcc4bd768be89df0dcb3c5aad37866cc08
    }
}
