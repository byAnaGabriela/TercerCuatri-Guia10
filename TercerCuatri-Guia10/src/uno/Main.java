package uno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Crear un programa que pida al usuario que ingrese dos números enteros y realice la división entre ellos.
        Manejar la excepción si el segundo número ingresado es cero.*/

        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        System.out.println("Introduce un número entero:");
        int num1 = sc.nextInt(); // Leer un número entero
        sc.nextLine();
        int num2 = sc.nextInt();

        try{
            int division = num1/num2;
            System.out.println(division);
        }catch (ArithmeticException e){

            System.out.println("###ERROR!!!: "+ e);
        }/*finally {
            System.out.println(division);
        }*/


    }
}
