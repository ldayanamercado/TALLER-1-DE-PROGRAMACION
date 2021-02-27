

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * Escriba un programa en Java que lea un carácter e imprima 
 * su correspondiente valor numérico (utilizar la conversión de tipos).

 *
 * @author Laura
 */
public class Punto5 {
    
    public static void main(String [] args){
    Scanner Entrada =new Scanner(System.in);
        System.out.println("Digite un caracter");
    String caracter = Entrada.nextLine();
   
        byte[] bytes = caracter.getBytes(StandardCharsets.US_ASCII);
        System.out.println("valor numerico es: "+bytes[0]);
   
        
    
    
    
    
    }
}
