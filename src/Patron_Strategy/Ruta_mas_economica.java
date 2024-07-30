package Patron_Strategy;

public class Ruta_mas_economica implements Ruta_Strategy{

    @Override
    public String Calcular_Ruta (String Punto_A, String Punto_B){
        return "Ruta más económica entre " + Punto_A + " y " + Punto_B;
    }
}
