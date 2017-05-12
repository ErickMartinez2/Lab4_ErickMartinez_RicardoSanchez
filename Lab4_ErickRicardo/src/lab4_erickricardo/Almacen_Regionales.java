package lab4_erickricardo;

public class Almacen_Regionales extends Almacen{
    public String Departamento;

    public Almacen_Regionales() {
        super();
    }

    public Almacen_Regionales(String Departamento, double Tamano, double Altura) {
        super(Tamano, Altura);
        this.Departamento = Departamento;
    }
    

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Almacen_Regionales{" + "Departamento=" + Departamento + '}';
    }
    
}
