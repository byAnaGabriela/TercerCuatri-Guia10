package cuatro.cuatroTest;

import cuatro.ValidadorDeFecha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Crear un programa que pida al usuario que ingrese una fecha en formato "dd/mm/aaaa" y la convierta a
        un objeto del tipo "LocalDate". Manejar la excepción si la fecha ingresada no tiene el formato correcto.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de hoy en formato dd/mm/yyyy");

            System.out.print("Ingrese una fecha: ");
            String entrada = scanner.nextLine();
            ValidadorDeFecha validador = new ValidadorDeFecha(entrada);
            validador.validador();

    }
}
