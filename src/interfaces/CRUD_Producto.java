
package interfaces;

import integrantes.txt.Producto;
import java.util.List;

public interface CRUD_Producto {
    public List listarproducto();
    public Producto buscarproducto(int idproducto);
    public boolean agregarproducto(Producto producto);
    public boolean editarproducto(Producto producto);
    public boolean eliminarproducto(int idproducto);
}