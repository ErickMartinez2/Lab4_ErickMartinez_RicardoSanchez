package lab4_erickricardo;

import java.util.Date;

public class Producto {
    public Date FechaEmision;
    public double precio, Tamao;
    public String Descripcion, NombreProducto;
    public int NumeroProductos;

    public Producto(Date FechaEmision, double precio, double Tamao, String Descripcion, String NombreProducto, int NumeroProductos) {
        this.FechaEmision = FechaEmision;
        this.precio = precio;
        this.Tamao = Tamao;
        this.Descripcion = Descripcion;
        this.NombreProducto = NombreProducto;
        this.NumeroProductos = NumeroProductos;
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

    public double getTamao() {
        return Tamao;
    }

    public void setTamao(double Tamao) {
        this.Tamao = Tamao;
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

    @Override
    public String toString() {
        return "Producto{" + "FechaEmision=" + FechaEmision + ", precio=" + precio + ", Tamao=" + Tamao + ", Descripcion=" + Descripcion + ", NombreProducto=" + NombreProducto + ", NumeroProductos=" + NumeroProductos + '}';
    }
    
}
