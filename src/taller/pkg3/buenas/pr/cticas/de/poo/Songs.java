
package taller.pkg3.buenas.pr.cticas.de.poo;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class Songs {
    private int id;
    private String title;
    private String date;
    private float duration;
    private String genre;
    private String cover;
    private String description;
    private int day;
    private int month;
    private int year;

    public Songs() {
    }

    public Songs(int id, String title,  int day, int month, int year, float duration, String genre, String cover, String description) {
        this.id = id;
        this.title = title;
        this.date = ( day + "-" + month + "-" + year);
        this.day = day;
        this.month = month;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Canción: " + "identificador = " + id + ", titulo = " + title + ", fecha = " + date + ", duración = " + duration + ", genero = " + genre + ", caratula = " + cover + ", descripción = " + description + '.';
    }
   
}
