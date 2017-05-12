package lab4_erickricardo;

import java.util.Scanner;

public class Almacen_Regionales extends Almacen {

    public String Departamento;
    Empleado_Seguridad ES = new Empleado_Seguridad();
    Scanner sc = new Scanner(System.in);
    
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

    @Override
    public boolean Cifrado_Transposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Riel() {
        String Contra = ES.Contrasena;
        char[][] Cifrado = new char[3][Contra.length()];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Contra.length(); j++) {
                Cifrado[i][j] = '-';
            }
        }
        for (int i = 0; i < 3; i++) {
            int h = 0;
            for (int j = 0; j < Contra.length(); j++) {
                if(i == j || 3 + i == j){
                    Cifrado[i][j] = Contra.charAt(j);
                    if(h == 2){
                        h = 0;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Contra.length(); j++) {
                System.out.print("[" + Cifrado[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("Ingrese la contrasena");
        String Comparar = sc.next();
        if(Contra.equals(Comparar)){
            return true;
        }else{
        return false;
        }
    }

    @Override
    public boolean Cifrado_Binario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Vigenere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Posicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Matrices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Alfabeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
