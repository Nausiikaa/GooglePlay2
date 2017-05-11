
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own
    private String titulo;
    private int anoCreacion;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo,int anoCreacion)
    {
        this.titulo = titulo;
        this.anoCreacion = anoCreacion;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public int getAno()
    {
        return anoCreacion;
    }
}
