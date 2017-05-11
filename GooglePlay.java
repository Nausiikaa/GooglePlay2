import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Producto> productosDisponibles;
    private ArrayList<Usuario> usuariosRegistrados;
    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        productosDisponibles = new ArrayList<Producto>();
        usuariosRegistrados = new ArrayList<Usuario>();
    }

    public void addUsuario(Usuario usuarioARegistrar)
    {
        usuariosRegistrados.add(usuarioARegistrar);
    }
    public void addProducto(Producto productoARegistrar)
    {
        productosDisponibles.add(productoARegistrar);
    }
    public int getNumeroUsuarios()
    {
        return usuariosRegistrados.size();
    }
    public int getNumeroProductos()
    {
        return productosDisponibles.size();
    }
}
