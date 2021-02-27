
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * . Escriba un programa en Java que le solicite al usuario el valor del radio
 * de una circunferencia y calcule su longitud y
área. Imprima los resultados (con dos números decimales)

 *
 * @author Laura
 */
public class Punto4 {
    public static void main (String [] args){
    Scanner Entrada = new Scanner(System.in);
    
        System.out.print(" Digite el valor del radio de la circunferencia ");
        float radio=Entrada.nextFloat();
        
        System.out.print(" \nla longitud de la circunferencia es : ");
        System.out.printf("[%.2f] ",2*Math.PI*radio);
        System.out.print(" \nEl area de la circunferencia es : ");
        System.out.printf("[%.2f] ",Math.PI*(radio*radio));
        System.out.println("  \n");
        
    
    
    }
    
    
}
