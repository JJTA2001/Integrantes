
package integrantes.txt;


public class Proveedor {
    private int idproveedor;
    private String nombre;
    private String ruc;
    private String direccion;
    private String estado;
    public Proveedor(){
    }

    public Proveedor(int idproveedor, String nombre, String ruc, String direccion, String estado) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
