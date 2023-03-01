package taller.pkg3.buenas.pr.cticas.de.poo;

/**
 *
 * @author Luis mendoza
 * @author Jaime Hoyos
 */
public class Songs {

    /**
     * El identificador de la cancion
     */
    private int id;
    /**
     * El titulo de la cancion
     */
    private String title;

    /**
     * Fecha de lanzamiento de la cancion
     */
    private String date;
    /**
     * Duracion de la cancion
     */
    private float duration;
    /**
     * Genero de la cancion
     */
    private String genre;
    /**
     * Caratula de cancion
     */
    private String cover;
    /**
     * Descripcion de la cancion
     */
    private String description;
    /**
     * Dia de lanzamiento de la cancion
     */
    private int day;
    /**
     * Mes de lanzamiento de la cancion
     */
    private int month;

    /**
     * Año de lanzamiento de la cancion
     */
    private int year;

    /**
     * Constructor vacio de la clase Songs
     */
    public Songs() {
    }

    /**
     * Constructor con argumentos de la clase Songs para inicializar sus
     * atributos
     *
     * @param id
     * @param title
     * @param day
     * @param month
     * @param year
     * @param duration
     * @param genre
     * @param cover
     * @param description
     */
    public Songs(int id, String title, int day, int month, int year, float duration, String genre, String cover, String description) {
        this.id = id;
        this.title = title;
        this.date = (day + "-" + month + "-" + year);
        this.day = day;
        this.month = month;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Obtiene el id de la cancion
     *
     * @return Id
     */
    public int getId() {
        return id;
    }

    /**
     * Asigna el id a la cancion
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el titulo de la cancion
     *
     * @return Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Asigna el titulo a la cancion
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene la fecha de la cancion
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * Asigna la fecha de lanzamiento de la cancion
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Obtiene duracion de la cancion
     *
     * @return duration
     */
    public float getDuration() {
        return duration;
    }

    /**
     * Asigna la duracion a la cancion
     *
     * @param duration
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * Obtiene el genero de la cancion
     *
     * @return genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Asigna el genero de la cancion
     *
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Obtiene la caratuula de la cancion
     *
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * Asigna la caratula de la cancion
     *
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Obtiene la descripcion de la cancion
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Asiga la descripcion de la cancion
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el dia de lanzamiento de la cancion
     *
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * Asiga el dia de lanzamiento de la cancion
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Obtiene el mes de lanzamiento de la cancion
     *
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Asiga el mes de lanzamiento la cancion
     *
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Obtiene el año de lanzamiento de la cancion
     *
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Asigna el año de lanzamiento de la cancion
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve una cadena que representa la cancion con todos sus atributos
     *
     * @return Una cadena que representa a la cancion con sus atributos
     * concatenados.
     */
    @Override
    public String toString() {
        return "Canción: " + "identificador = " + id + ", titulo = " + title + ", fecha = " + date + ", duración = " + duration + ", genero = " + genre + ", caratula = " + cover + ", descripción = " + description;
    }

}
