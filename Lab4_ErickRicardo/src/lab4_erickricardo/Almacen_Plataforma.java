package lab4_erickricardo;

import java.util.Scanner;

public class Almacen_Plataforma extends Almacen{
    Empleado_Seguridad ES = new Empleado_Seguridad();
    Scanner sc = new Scanner(System.in);
    
    public Almacen_Plataforma() {
        super();
    }

    public Almacen_Plataforma(double Tamano, double Altura) {
        super(Tamano, Altura);
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
                int k = 0;
                if (i == j || 3 + i == j) {
                    Cifrado[i][j] = Contra.charAt(k);
                    if (h == 2) {
                        h = 0;
                    }
                }
                k++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Contra.length(); j++) {
                System.out.println("[" + Cifrado[i][j] + "] ");
            }
        }
        System.out.println("Ingrese la contrasena");
        String Comparar = sc.next();
        if (Contra.equals(Comparar)) {
            return true;
        } else {
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
