
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 * 3. Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, 
 * promedio, producto, cociente y modulo. Los resultados se deben imprimir en formato decimal 
 * con dos cifras significativas.
 * 
 */
public class Punto3 {
    public static void  main(String[]args){
    Scanner Entrada = new Scanner(System.in);
        System.out.println(" Digite tres numeros decimales");
        float num1 = Entrada.nextFloat();
        float num2 = Entrada.nextFloat();
        float num3= Entrada.nextFloat();
        
        System.out.println(" La suma de los numeros es ");
        float suma=0;
        suma=num1+num2+num3;
        System.out.printf("[%.2f] + [%.2f] + [%.2f] = "+ suma ,num1,num2,num3);
        
        System.out.println(" el promedio de los numeros es ");
        float promedio;
        promedio =suma/3;
        System.out.printf("el promedio es: [%.2f] " , promedio);
        System.out.println(" el producto de los numeros es ");
        float producto;
        producto=num1*num2*num3;
        System.out.printf("el producto es: [%.2f] " , producto);
        System.out.println(" el cociente de los numeros es ");
        float cociente ;
        cociente=num1/num2/num3;
        System.out.printf("el cociente es: [%.2f] " , cociente);
        System.out.println(" el modulo de los numeros es ");
        float modulo;
        modulo= num1%num2%num3;
        System.out.printf("el modulo es: [%.2f] " , modulo);
        
        
    
    }
           
}
