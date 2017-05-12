package lab4_erickricardo;

import java.util.Scanner;

public class Almacen_Temporales extends Almacen{
    Empleado_Seguridad ES = new Empleado_Seguridad();
    Scanner sc = new Scanner(System.in);
    
    public Almacen_Temporales() {
    }

    public Almacen_Temporales(double Tamano, double Altura) {
        super(Tamano, Altura);
    }

    @Override
    public boolean Cifrado_Transposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Riel() {
        String Contra = ES.getContrasena();
        char [][] Cifrado = new char[3][Contra.length()];
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
