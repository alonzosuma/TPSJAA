package Patron_Strategy;

public class Ruta_mas_corta implements Ruta_Strategy{
    @Override
    public String Calcular_Ruta (String Punto_A, String Punto_B){
        return "Ruta más corta entre " + Punto_A + " y " + Punto_B;
    }
}
