/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v2) y realiza los
siguientes cambios:
• Ahora los atributos ancho y alto serán privados.
• Añade los métodos getter y setter para ambos atributos.
• Modifica la clase Triangulo obligados por los cambios en su clase padre.
• Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que el
programa creado en el ejercicio anterior sigue funcionando.

*/
package dam107t2e2;

import dam107t2e1.*;
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
