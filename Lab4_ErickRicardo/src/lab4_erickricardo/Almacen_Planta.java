package lab4_erickricardo;

public class Almacen_Planta extends Almacen{
    public int NumPlanta;

    public Almacen_Planta() {
        super();
    }

    public Almacen_Planta(int NumPlanta, double Tamano, double Altura) {
        super(Tamano, Altura);
        this.NumPlanta = NumPlanta;
    }
    

    public int getNumPlanta() {
        return NumPlanta;
    }

    public void setNumPlanta(int NumPlanta) {
        this.NumPlanta = NumPlanta;
    }

    @Override
    public String toString() {
        return "Almacen_Planta{" + "NumPlanta=" + NumPlanta + '}';
    }
    
}
