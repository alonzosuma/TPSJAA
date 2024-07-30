package Patron_Strategy;

public class Main {
    public static void main (String[] args) {

        Navegador_GPS gps = new Navegador_GPS(new Rutas_Mas_Rapidas());
        gps.Calcular_Ruta("Punto A", "Punto B");
        gps.setStrategy(new Ruta_mas_corta());
        gps.Calcular_Ruta("Punto A", "Punto B");
        gps.setStrategy(new Ruta_mas_economica());
        gps.Calcular_Ruta("Punto A", "Punto B");
    }
}
