
/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto 
{
    private String nombre;
    private int numVendido;

    /**
     * Constructor for objects of class Productos
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
        numVendido = 0;
    }

    public int getNumVendido()
    {
        return numVendido;
    }

    public String getNombreGlobal()
    {
        return nombre;
    }
    
    public void aumentarVendidos()
    {
        numVendido++;
    }
    
    public abstract double getPrecio();
    
        
    
}
