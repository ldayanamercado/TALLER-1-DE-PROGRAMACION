
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Desarrolle un programa en java que lea una cantidad numérica entre cero y mil 
 * (0 y 1000) e imprima la cifra
correspondiente a sus unidades, decenas y centenas.
 *
 * @author Laura
 */
public class Punto11 {
    public static void main (String [] args){
        Scanner Entrada = new Scanner (System.in);
        System.out.print("Digite un numero entre 0 y 1000 : ");
        int numero = Entrada.nextInt();
        
	// ////// Obtener las unidades, decenas, centenas ////////	
	int millares = numero / 1000 ;
	int centenas = (numero- (millares * 1000 )) / 100 ;
	int decenas = (numero- (millares * 1000 + centenas * 100 )) / 10 ;
	int unidades = numero- (millares * 1000 + centenas * 100 + decenas * 10 );
        System.out.printf(" Millares = %d \n " , millares);
        System.out.printf(" Centenas = %d \n " , centenas);
        System.out.printf(" Decenas = %d \n " , decenas);
	System.out.printf(" Unidades = %d \n " , unidades);

        
    
    
    }
    
    
    
    
}
