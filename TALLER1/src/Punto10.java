
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *. Escriba un programa en Java que lea el peso de un objeto (en kilogramos) 
 * e imprima su equivalencia en: gramos, libras,
toneladas.
 * @author Laura
 */
public class Punto10 {
    public static void main (String []arg ){
    Scanner Entrada =new Scanner (System.in);
    
        System.out.println("Digite el peso de un objeto en kilogramos");
        float pesoKilogramos = Entrada.nextFloat();
        float pesoGramos,pesoTonelada,pesoLibra ;
        pesoGramos = pesoKilogramos*1000;
        System.out.printf("\nEl peso en Gramo es: [ %.2f ]" ,pesoGramos);
        pesoLibra = pesoGramos/454;
        System.out.printf("\nEl peso en Libra es:  [%.2f]", pesoLibra);
        pesoTonelada = pesoKilogramos/1000;
        System.out.printf(" \nel peso en Tonelada es: [%.2f]",pesoTonelada);

        
        
        
    
        
    
    }
}
