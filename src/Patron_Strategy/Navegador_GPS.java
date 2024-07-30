package Patron_Strategy;

public class Navegador_GPS {
    private Ruta_Strategy strategy;

    public  Navegador_GPS (Ruta_Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Ruta_Strategy strategy){
        this.strategy = strategy;
    }

    public void Calcular_Ruta (String Punto_A, String Punto_B){
        System.out.println(strategy.Calcular_Ruta(Punto_A, Punto_B));
    }
}
