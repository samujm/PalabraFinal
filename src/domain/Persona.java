
package domain;


public /*final*/ class Persona {
    
    //Una variable marcada como final se combina con static para convertir en CONSTANTE (PUBLIC FINAL STATIC TIPO NOMBRE)
    //CONSTANTE EN MAYUSCULAS Y SEPARADAS POR GUION BAJO
    public final static int MI_CONSTANTE = 1;
    
    public /*final*/ void imprimir(){ //Si el metodo en la clase padre se marca como final entonces se está indicando que las clases hijas ya no podran modificar el comportamiento de este metodo en las clases hijas
        System.out.println("Metodo imprimir");
    }
}
