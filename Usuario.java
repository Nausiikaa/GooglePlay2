import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String correo;
    private ArrayList<Producto> productosComprados;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String correo)
    {
        productosComprados = new ArrayList<Producto>();
        this.correo = correo;
    }
    
    public String getNombreCuenta()
    {
        return correo;
    }
}
