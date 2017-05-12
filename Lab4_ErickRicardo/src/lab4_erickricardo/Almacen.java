package lab4_erickricardo;

import java.util.ArrayList;

public class Almacen {
    public ArrayList <Empleado> E = new ArrayList();
    public ArrayList <Producto> P = new ArrayList();
    public double Tamano, Altura;
    public ArrayList <Cliente> C = new ArrayList();

    public Almacen() {
    }

    public Almacen(double Tamano, double Altura) {
        this.Tamano = Tamano;
        this.Altura = Altura;
    }

    public ArrayList<Empleado> getE() {
        return E;
    }

    public void setE(ArrayList<Empleado> E) {
        this.E = E;
    }

    public ArrayList<Producto> getP() {
        return P;
    }

    public void setP(ArrayList<Producto> P) {
        this.P = P;
    }

    public double getTamano() {
        return Tamano;
    }

    public void setTamano(double Tamano) {
        this.Tamano = Tamano;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public ArrayList<Cliente> getC() {
        return C;
    }

    public void setC(ArrayList<Cliente> C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Almacen{" + "E=" + E + ", P=" + P + ", Tamano=" + Tamano + ", Altura=" + Altura + ", C=" + C + '}';
    }
    
    
}
