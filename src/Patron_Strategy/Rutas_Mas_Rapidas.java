package Patron_Strategy;

public class Rutas_Mas_Rapidas implements Ruta_Strategy{

    @Override
    public String Calcular_Ruta (String Punto_A, String Punto_B) {
        return "Ruta más rapida entre " + Punto_A + " y " + Punto_B;
    }
}
