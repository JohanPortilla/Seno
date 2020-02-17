/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author johan.portilla
 */
public class Vista {
    String texto="";
    
    public void Vista(PrintStream esc){
        esc = System.out.printf(texto);
    }
    public void leer(Double sc){
        Scanner lee = new Scanner(System.in);
        sc = lee.nextDouble();
    }
}