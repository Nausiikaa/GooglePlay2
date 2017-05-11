
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int duracion;
    private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo,int anoCreacion,int duracion,int calidad)
    {
       super(titulo,anoCreacion);
       this.duracion = duracion;
       this.calidad = calidad;
    }

    public int getDuracion()
    {
        return duracion;
    }
    public String getCalidad()
    {
        String devolver = "HD";
        if(calidad == 1080){
            devolver = "FullHD";
        }
        return devolver;
    }
    public double getPrecio()
    {
        double devolver = 0;
        if(getCalidad().equals("FullHD"))
        {
            if(getAno() < 2000)
            {
                devolver = 5;
            }
            else
            {
                devolver = 10;
            }
        }
        else
        {
            if(getAno() < 2000)
            {
                devolver = 2.50;
            }
            else
            {
                devolver = 5;
            }
        }
        return devolver;
    }
}
