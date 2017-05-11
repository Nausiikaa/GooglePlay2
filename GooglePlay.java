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

    public double comprar(String idUsuario,String identificadorProducto)
    {
        int contador = 0;
        double devolver = -1;
        boolean comp = false;
        Producto producto = null;
        Usuario usuario = null;
        while(contador < productosDisponibles.size() && comp == false)
        {
            if(productosDisponibles.get(contador).getNombreGlobal().equals(identificadorProducto))
            {
               producto = productosDisponibles.get(contador);
               comp = true;
            }
            contador++;
        }
        contador = 0;
        comp = false;
        while(contador < usuariosRegistrados.size() && comp == false)
        {
            if(usuariosRegistrados.get(contador).getNombreCuenta().equals(identificadorProducto))
            {
               usuario = usuariosRegistrados.get(contador);
            }
            contador++;
        }
        if(usuario != null && producto != null)
        {
            producto.aumentarVendidos();
            devolver = producto.getPrecio();
        }
        return devolver;
    }
}