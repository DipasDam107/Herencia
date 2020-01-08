/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v3) y realiza los
siguientes cambios:
• Añade un constructor a la clase Triangulo al que se le pasan tres parámetros: estilo, alto y ancho.
• Se invocará al constructor por defecto de la clase base.
• Modificar el programa de los ejercicios anteriores para que los triángulos sean creados mediante
este nuevo constructor

*/
package dam107t2e3;

import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double altura, anchura;
        String estilo;
        System.out.println("Dime Altura: ");
        altura=teclado.nextDouble();
        System.out.println("Dime Ancho: ");
        anchura=teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Dime estilo: ");
        estilo=teclado.nextLine();
        
        Triangulo t1 = new Triangulo(altura, anchura, estilo);
        
        t1.verDim();
        System.out.println("Area: " + t1.area());
        System.out.println("El estilo es " + t1.getEstilo());
    }
}
