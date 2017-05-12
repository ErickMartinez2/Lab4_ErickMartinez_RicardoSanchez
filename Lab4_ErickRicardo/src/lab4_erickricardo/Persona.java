package lab4_erickricardo;

public class Persona {
    public String Nombre, Residencia, ID;
    public int Edad;
    public double Altura, Peso;

    public Persona() {
    }

    public Persona(String Nombre, String Residencia,String ID, int Edad, double Altura, double Peso) {
        this.Nombre = Nombre;
        this.Residencia = Residencia;
        this.ID = ID;
        this.Edad = Edad;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Residencia=" + Residencia + ", ID=" + ID + ", Edad=" + Edad + ", Altura=" + Altura + ", Peso=" + Peso + '}';
    }

    
}
