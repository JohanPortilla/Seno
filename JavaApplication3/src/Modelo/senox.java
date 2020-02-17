/*
 * Método que calcula Sen(x) por medio de la serie de Tylor
 */
package Modelo;

import Vista.*;

/**
 *
 * @author johan.portilla
 */
public class senox {
    public double senx (double valor){
        int cont=1;
        double potencia1=1;
        double potencia2=3;
        double y;
        double sumapositiva=0.0;
        double sumanegativa=0.0;
        
        factorial fact =new factorial();
        do{
            sumapositiva=sumapositiva+(Math.pow(valor, potencia1))/fact.calcula_factorial(potencia1); //Serie de tylor
            potencia1+=4;
            sumanegativa=sumanegativa-(Math.pow(valor, potencia2))/fact.calcula_factorial(potencia2); //Serie de Tylor
            potencia2+=4;
            cont++;
        }
        while(cont<4);
        y=sumapositiva+sumanegativa;
        return y;
    }
}
