
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDivision
{
    public static void main (String args[])
    {
        int numerador, denominador;
        Scanner entrada = new Scanner(System.in);
        boolean continuarCiclo = true;
        
        do
        {
            try
            {
                System.out.println("Ingrese en numerador");
                numerador = entrada.nextInt();
        
                System.out.println("Ingrese el denominador");
                denominador = entrada.nextInt();
        
                System.out.println("El resultado es: "+DivisionCero.division(numerador, 
                denominador));
                continuarCiclo = false;
            }
            catch (InputMismatchException a)
            {
                System.err.printf("Excepción: %s%n", a);
                entrada.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo.");
            }
            catch (ArithmeticException b)
            {
                System.err.printf("Exception: %s%n", b);
                System.out.printf("Cero es un denominador inválido. Intente de "
                        + "nuevo. \n");
            }
        }
        while (continuarCiclo);
    }
}
