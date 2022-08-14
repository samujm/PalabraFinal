package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        //EN VARIABLE: Evita cambiar el valor que almacena la variable
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
       // miVariable = 5; //No se puede asignar a un valor a una variable con final (linea 7)

        //EN METODOS: Evita que los metodos en la clase hija modifiquen en la clase padre
        //EN CLASES: Evita que creemos clases hijas de la clase que se infido
        
        //EN VARIABLES SE COMBINA CON STATIC PARA CONVERTIR LA VARIABLE EN CONSTANTE
        //Persona.MI_CONSTANTE = 2; //No se puede modificar una constante
        
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
    }
}
