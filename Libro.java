
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int numPaginas;
    private boolean ficcion; 

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo,int anoCreacion,int numPaginas,boolean ficcion)
    {
        super(titulo,anoCreacion);
        this.numPaginas = numPaginas;
        this.ficcion = ficcion;
    }
    public int getNumeroPaginas()
    {
        return numPaginas;
    }
    public boolean getFiccion()
    {
        return ficcion;
    }
    public double getPrecio()
    {
        double precio = (getNumeroPaginas()/100)*(2010 - getAno());
        return precio;
    }
}
