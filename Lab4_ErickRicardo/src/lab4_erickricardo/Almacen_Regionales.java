package lab4_erickricardo;

import java.util.Random;
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
        String Contra = ES.getContrasena();
        String Clave = ES.getClave();
        Random rd = new Random();
        Object[][] Cifrado = new Object[4][Contra.length()];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < Contra.length(); j++) {
                char ch;
                int Dis;
                String AlfabetoM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String Alfabetom = "abcdefghijklmnopqrstuvwxyz";
                if (i == 0) {
                    Cifrado[i][j] = Contra.charAt(j);
                } else if (i == 1) {
                    if (((int) (Contra.charAt(j))) > 91) {
                        ch = Contra.charAt(j);
                        Dis = Alfabetom.indexOf(ch);
                        Cifrado[i][j] = Dis;
                    } else {
                        ch = Contra.charAt(j);
                        Dis = AlfabetoM.indexOf(ch);
                        Cifrado[i][j] = Dis;
                    }

                } else if (i == 2) {
                    Cifrado[i][j] = Clave.charAt(j);
                } else if (i == 3) {
                    if (((int) (Contra.charAt(j))) > 91) {
                        ch = Contra.charAt(j);
                        Dis = Alfabetom.indexOf(ch);
                        char ch1 = Clave.charAt(j);
                        int Dis1 = ((int)Clave.charAt(j));
                        for (int k = 0; k < Dis; k++) {
                            Dis1++;
                            if(Dis1 == 123){
                                Dis1 = 97;
                            }
                        }
                        Cifrado[i][j] = ((char)Dis1);
                    }else{
                       ch = Contra.charAt(j);
                        Dis = AlfabetoM.indexOf(ch);
                        char ch1 = Clave.charAt(j);
                        int Dis1 = ((int)Clave.charAt(j));
                        for (int k = 0; k < Dis; k++) {
                            Dis1++;
                            if(Dis1 == 91){
                                Dis1 = 65;
                            }
                        }
                        Cifrado[i][j] = ((char)Dis1);
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < Contra.length(); j++) {
                System.out.print("[" + Cifrado[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("Ingrese la contrasena");
        String Comp = sc.next();
        System.out.println("Ingrese la clave");
        String Comp1 = sc.next();
        if(Comp.equals(Contra) && Comp1.equals(Clave)){
            return true;
        }else{
            return false;
        }  
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
        String clave = ES.getClave();
        String Binario = "";
        String BinarioReversa = "";
        for (int i = 0; i < clave.length(); i++) {
            Binario += Integer.toBinaryString(clave.charAt(i));
        }
        System.out.println("Binario original " + Binario);
        for (int i = Binario.length() - 1; i > 0; i--) {
            BinarioReversa += Binario.charAt(i);
        }
        System.out.println("Binario al reves " + BinarioReversa);
        return true;
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
