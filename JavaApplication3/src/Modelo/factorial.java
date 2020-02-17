package Modelo;
import Vista.*;

/**
 * Método que calcula el factorial de un número
 * @author johan.portilla
 */
public class factorial {
    
    public int calcula_factorial(double n){
        int factorial=1;
        for ( int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial; //devuelve el factorial de n
    }
}
