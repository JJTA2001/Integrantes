package interfaces;

import integrantes.txt.Proveedor;
import java.util.List;

public interface CRUD_Proveedor {
    public List listarproveedor();
    public Proveedor buscarproveedor(int idproveedor);
    public boolean agregarproveedor(Proveedor proveedor);
    public boolean editarproveedor(Proveedor proveedor);
    public boolean eliminarproveedor(int proveedor);
}
