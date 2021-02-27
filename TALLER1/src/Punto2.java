
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Punto2 {
    public  static void main(String[] args){
    Scanner Entrada = new Scanner(System.in);
        System.out.println("DIGITE DOS NUMEROS");
    int num1 = Entrada.nextInt();
    int num2 = Entrada.nextInt();
    
        System.out.print(" los numeros que usted digito son: ");
        System.out.printf("[ %d ] [ %d ]",num1,num2);
        System.out.print(" \nLa suma de los  numeros es");
        int suma=num1+num2;
        System.out.printf("[%d ] + [%d] = "+ suma,num1,num2);
        System.out.print("\n El producto de los  numeros es");
        int producto=num1*num2;
        System.out.printf("[%d ] * [%d] = "+ producto ,num1,num2);
        System.out.print("\n la diferencia de los  numeros es");
        int resta=num1-num2;
        System.out.printf("[%d ] - [%d] = "+ resta ,num1,num2);
        System.out.println("\n _____________________________________\n");
        
    
        
        
    
        
        
    
    }
}
