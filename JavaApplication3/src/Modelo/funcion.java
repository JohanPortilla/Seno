/*
 * @author johan.portilla
 * Programa para calcular Sen(x) por medio de la serie de Tylor
 * Universidad Minuto de Dios
 * Pruebas, validación y verificación de Software
 */
package Modelo;
import Vista.*;
import java.io.PrintStream;
import java.util.Scanner;

public class funcion {
    
    public funcion(){
        Scanner scan = new Scanner(System.in);
        
        Vista v = new Vista();
        double x,y;
        senox s = new senox();
        PrintStream jj = null;
        String grados = "Escriba los grados: ";
        v.Vista(jj);
        jj=System.out.printf(grados);
        //System.out.printf("Escriba los grados: ");
        //Scanner s1 = null;
        //v.leer(s1);
        double g= scan.nextDouble();                        //leer los grados introducidos
        x=g*3.1415926535/180.0;                             // convertir grados a radianes
        y=s.senx(x);                                        // se llama al método senx
        System.out.println("El seno de " + g + " es: " + y);//se imprime el valor de sen(x)
    }
}