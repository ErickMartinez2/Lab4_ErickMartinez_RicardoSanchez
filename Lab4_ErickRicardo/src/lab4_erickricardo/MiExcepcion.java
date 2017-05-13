package lab4_erickricardo;

public class MiExcepcion extends Exception {

    public MiExcepcion(String string) {
        super(string);
    }

    public static void edad(int e) throws MiExcepcion {
        if (e < 18) {
            throw new MiExcepcion("La edad no puede ser menor de 18 años!");
        }
    }
    
    
}
