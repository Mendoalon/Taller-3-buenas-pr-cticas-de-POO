package taller.pkg3.buenas.pr.cticas.de.poo;

import java.util.ArrayList;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public interface MainLibraryInteface {

    public ArrayList defaultPlaylist();

    public void showSongList(ArrayList<Songs> songs);

    public void filterSonGen(ArrayList<Songs> playList);

    public void filterSonYear(ArrayList<Songs> playList);

    public void SortDuration(ArrayList<Songs> songs);

    public void SortDate(ArrayList<Songs> songs);
}
