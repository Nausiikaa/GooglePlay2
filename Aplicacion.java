
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private double espacio;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombreApp,double espacioNecesario,Categoria categoria)
    {
        super(nombreApp);
        espacio = espacioNecesario;
        this.categoria = categoria;
    }

    public String getNombre()
    {
        return getNombreGlobal();
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
    
    public double getPrecio()
    {
        double devolver = 0;
        if(getNumVendido() >= 5){
            switch(categoria)
            {
                case JUEGOS:
                devolver = 5;
                break;
                case COMUNICACIONES:
                devolver = 2;
                break;
                case PRODUCTIVIDAD:
                devolver = 10;
                break;
                case MULTIMEDIA:
                devolver = 2;
                break;
            }
        }
        else
        {
            devolver = 0.99;
        }
        return devolver;
    }
}
