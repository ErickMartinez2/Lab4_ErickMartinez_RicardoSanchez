package lab4_erickricardo;

public class Empleado_Seguridad extends Empleado{
    public String Contrasena, DiaTrabajo, Clave;

    public Empleado_Seguridad() {
        super();
    }

    public Empleado_Seguridad(String Contrasena, String Clave, String DiaTrabajo, double Sueldo, String Nombre, String Residencia, String ID, int Edad, double Altura, double Peso) {
        super(Sueldo, Nombre, Residencia, ID, Edad, Altura, Peso);
        this.Contrasena = Contrasena;
        this.DiaTrabajo = DiaTrabajo;
        this.Clave = Clave;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getDiaTrabajo() {
        return DiaTrabajo;
    }

    public void setDiaTrabajo(String DiaTrabajo) {
        this.DiaTrabajo = DiaTrabajo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado_Seguridad{" + "Contrasena=" + Contrasena + ", DiaTrabajo=" + DiaTrabajo + ", Clave=" + Clave + '}';
    }
    
    
}
