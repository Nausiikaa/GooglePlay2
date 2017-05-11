
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own
    private int anoCreacion;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo,int anoCreacion)
    {
        super(titulo);
        this.anoCreacion = anoCreacion;
    }
    public String getTitulo()
    {
        return getNombreGlobal();
    }
    public int getAno()
    {
        return anoCreacion;
    }
}
