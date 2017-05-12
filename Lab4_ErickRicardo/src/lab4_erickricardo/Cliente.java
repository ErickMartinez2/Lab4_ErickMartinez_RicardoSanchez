package lab4_erickricardo;

import java.util.Date;

public class Cliente extends Persona{
    public double DineroBolsillo;
    public Date PrimeraCompra;

    public Cliente() {
        super();
    }

    public Cliente(double DineroBolsillo, Date PrimeraCompra, String Nombre, String Residencia, String ID, int Edad, double Altura, double Peso) {
        super(Nombre, Residencia, ID, Edad, Altura, Peso);
        this.DineroBolsillo = DineroBolsillo;
        this.PrimeraCompra = PrimeraCompra;
    }

    public double getDineroBolsillo() {
        return DineroBolsillo;
    }

    public void setDineroBolsillo(double DineroBolsillo) {
        this.DineroBolsillo = DineroBolsillo;
    }

    public Date getPrimeraCompra() {
        return PrimeraCompra;
    }

    public void setPrimeraCompra(Date PrimeraCompra) {
        this.PrimeraCompra = PrimeraCompra;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "DineroBolsillo=" + DineroBolsillo + ", PrimeraCompra=" + PrimeraCompra + '}';
    }
    
    
}
