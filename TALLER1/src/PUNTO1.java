
import java.util.Scanner;




public class PUNTO1 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.print(" Ingrese el valor de num 1:  ");
        //leo la variable
        int num1 = Entrada.nextInt();
        System.out.print("Ingrese el valor de num 2:  ");
        int num2 = Entrada.nextInt();
        System.out.println(" PUNTO [A] ");
        System.out.printf("num1 = %d\n", num1 );
        System.out.printf("num2 = %d\n", num2 );
        System.out.println(" \nPUNTO [B]");
       System.out.printf("El valor de %d + %d es %d", num1, num2, ( num1 + num2 ) );
        System.out.println("\n PUNTO [C]");
        System.out.printf(" num1 = %.1f\n", (double)num1);
        System.out.printf(" num2 = %.1f\n", (double)num2);
        System.out.println(" PUNTO [D]");
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
       
    }
    
}
