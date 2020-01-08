/*
Añade un constructor a la clase Figura2D al que se le pasan dos parámetros: alto y ancho.
¿Funciona ahora el constructor de Triangulo (creado en el ejercicio anterior)? ¿Por qué?
• Reescribe el constructor de Triangulo creado en el ejercicio anterior para que haga uso del nuevo
constructor de la clase base.
• Comprueba que el programa creado en el ejercicio anterior sigue funcionando.
• Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que sigue
funcionando. 

*/
package dam107t2e4;

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
