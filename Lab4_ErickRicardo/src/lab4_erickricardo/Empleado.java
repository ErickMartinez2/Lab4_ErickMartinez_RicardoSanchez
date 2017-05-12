package lab4_erickricardo;

public class Empleado extends Persona{
    public double Sueldo;

    public Empleado() {
    super();
    }

    public Empleado(double Sueldo, String Nombre, String Residencia, String ID, int Edad, double Altura, double Peso) {
        super(Nombre, Residencia, ID, Edad, Altura, Peso);
        this.Sueldo = Sueldo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
}
