
import java.util.Scanner;

/**Desarrolle un programa en java que calcule el índice de masa corporal
 * BMI el cual está dado por la formula (pesoenKg
/ alturaenmetros*alturaenmetros)

 *
 * @author Laura
 */
public class Punto6 {
    public static void main(String [] args){
    Scanner Entrada = new Scanner (System.in);
        System.out.print(" Digite su peso en kg: ");
        float peso = Entrada.nextFloat();
        System.out.print(" Digite su altura: ");
        float altura = Entrada.nextFloat();
        float masaCorporal = peso/(altura*altura);
        System.out.printf("El idice de su masa corporal es : [ %.2f ] " ,masaCorporal);
    
    
    
    }
    
}
