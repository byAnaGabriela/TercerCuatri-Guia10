package dos.dosTest;

import dos.Persona;

public class Main {
    public static void main(String[] args) throws Exception {

        /*Crear una clase "Persona" con los atributos "nombre" y "edad". Crear un método "validarEdad" que lance una
        excepción si la edad es menor que cero o mayor que 120.*/

        Persona nelso = new Persona("Nelso", 24);

        nelso.validadEdad();
    }
}
