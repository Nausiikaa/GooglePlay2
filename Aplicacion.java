
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private String nombreApp;
    private double espacio;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombreApp,double espacioNecesario,Categoria categoria)
    {
        this.nombreApp = nombreApp;
        espacio = espacioNecesario;
        this.categoria = categoria;
    }
    public String getNombre()
    {
        return nombreApp;
    }
    public double getTamanoEnMB()
    {
        return espacio;
    }
    public String getCategoria()
    {
        String devolver ="";
        switch(categoria)
        {
            case JUEGOS:
            devolver = "Juegos";
            break;
            case COMUNICACIONES:
            devolver = "Comunicaciones";
            break;
            case PRODUCTIVIDAD:
            devolver = "Productividad";
            break;
            case MULTIMEDIA:
            devolver = "Multimedia";
            break;
        }
        return devolver;
    }
}
