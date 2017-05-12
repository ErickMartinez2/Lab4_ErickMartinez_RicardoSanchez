package lab4_erickricardo;

public class Almacen_Planta extends Almacen{
    public int NumPlanta;
    Empleado_Seguridad ES = new Empleado_Seguridad();
    
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
    
    @Override
    public boolean Cifrado_Transposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Cifrado_Riel() {
        String Contra = ES.Contrasena;
        char [][] Cifrado = new char[3][Contra.length()];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Contra.length(); j++) {
                Cifrado[i][j] = '-';
            }
        }
        for (int i = 0; i < 3; i++) {
            int h = 0;
            for (int j = 0; j < Contra.length(); j++) {
                int k = 0;
                if(i == j){
                    Cifrado[i][j] = Contra.charAt(k);
                    if(h == 2){
                        h = 0;
                    }
                }else{
                    
                }
                k++;
            }
            h++;
        }
        return false;
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
