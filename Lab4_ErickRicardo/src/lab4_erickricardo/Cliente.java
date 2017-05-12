package lab4_erickricardo;

import java.util.ArrayList;
import java.util.Calendar;

public class Cliente extends Persona{
    public double DineroBolsillo;
    public Calendar PrimeraCompra;
    public ArrayList<Producto> p = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(double DineroBolsillo, Calendar PrimeraCompra, String Nombre, String Residencia, String ID, int Edad, double Altura, double Peso) {
        super(Nombre, Residencia, ID, Edad, Altura, Peso);
        this.DineroBolsillo = DineroBolsillo;
        this.PrimeraCompra = PrimeraCompra;
    }

    public ArrayList<Producto> getP() {
        return p;
    }

    public void setP(ArrayList<Producto> p) {
        this.p = p;
    }

    public double getDineroBolsillo() {
        return DineroBolsillo;
    }

    public void setDineroBolsillo(double DineroBolsillo) {
        this.DineroBolsillo = DineroBolsillo;
    }

    public Calendar getPrimeraCompra() {
        return PrimeraCompra;
    }

    public void setPrimeraCompra(Calendar PrimeraCompra) {
        this.PrimeraCompra = PrimeraCompra;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "DineroBolsillo=" + DineroBolsillo + ", PrimeraCompra=" + PrimeraCompra + '}';
    }
    
    
}
