package Control;
import Modelo.*;
import Vista.*;
import java.util.Scanner;
/**
 *Control de opciones para los procesos que se desean realizar en el programa.
 * Contiene el menú principal
 * @author johan.portilla
 */
public class Control {
    public static void main(String[] args) {
            
        while (true) {
            //Opciones para elegir al ejecitar el programa
            System.out.println("\n\n1. Obtener Seno");
            System.out.println("2. Salir");
            
            Scanner scan = new Scanner(System.in);
            
            int val = scan.nextInt();

            switch (val) {
                case 1:
                    funcion func = new funcion();
                    break;
                case 2:
                    return;
            }
        }
    }
}