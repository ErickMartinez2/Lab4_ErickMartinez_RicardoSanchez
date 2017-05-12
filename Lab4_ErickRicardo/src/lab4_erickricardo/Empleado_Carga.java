package lab4_erickricardo;

import java.util.Date;

public class Empleado_Carga extends Empleado{
    public Date FechaInicio;
    public String HoraEntrada, HoraSalida;

    public Empleado_Carga() {
        super();
    }

    public Empleado_Carga(Date FechaInicio, String HoraEntrada, String HoraSalida, double Sueldo, String Nombre, String Residencia, String ID, int Edad, double Altura, double Peso) {
        super(Sueldo, Nombre, Residencia, ID, Edad, Altura, Peso);
        this.FechaInicio = FechaInicio;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado_Carga{" + "FechaInicio=" + FechaInicio + ", HoraEntrada=" + HoraEntrada + ", HoraSalida=" + HoraSalida + '}';
    }
    
    
}
