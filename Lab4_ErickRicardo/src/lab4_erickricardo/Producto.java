package lab4_erickricardo;

import java.util.Date;

public class Producto {
    public Date FechaEmision;
    public double precio, Tamano;
    public String Descripcion, NombreProducto;
    public int NumeroProductos;
    public String VidaUtil;
    
    public Producto(Date FechaEmision, double precio, double Tamano, String Descripcion, String NombreProducto, int NumeroProductos, String VidaUtil) {
        this.FechaEmision = FechaEmision;
        this.precio = precio;
        this.Tamano = Tamano;
        this.Descripcion = Descripcion;
        this.NombreProducto = NombreProducto;
        this.NumeroProductos = NumeroProductos;
        this.VidaUtil = VidaUtil;
    }

    public Date getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(Date FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTamano() {
        return Tamano;
    }

    public void setTamano(double Tamano) {
        this.Tamano = Tamano;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getNumeroProductos() {
        return NumeroProductos;
    }

    public void setNumeroProductos(int NumeroProductos) {
        this.NumeroProductos = NumeroProductos;
    }

    public String getVidaUtil() {
        return VidaUtil;
    }

    public void setVidaUtil(String VidaUtil) {
        this.VidaUtil = VidaUtil;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "FechaEmision=" + FechaEmision + ", precio=" + precio + ", Tamano=" + Tamano + ", Descripcion=" + Descripcion + ", NombreProducto=" + NombreProducto + ", NumeroProductos=" + NumeroProductos + '}';
    }
    
}
