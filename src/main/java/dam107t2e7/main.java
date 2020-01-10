/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v7) y realiza los
siguientes cambios:
• Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetro otro objeto de tipo
Figura2D_v7 y que copiará todos sus datos.
• Hacer otro constructor análogo para la clase Triangulo_v7.
• Hay un programa que cree un Triangulo_v7 con el constructor de 3 parámetros creado
previamente, y otro triángulo utilizando el nuevo constructor. Mostrar el área de ambos.


*/
package dam107t2e7;

import dam107t2e6.*;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
       
        System.out.println("-------------------------------------");
        Triangulo t1 = new Triangulo(2,3, "Triangulo");
        t1.verDim();
        System.out.println("Area: " + t1.area());
        System.out.println("El estilo es " + t1.getEstilo());
        
        System.out.println("-------------------------------------");
        Triangulo t2 = new Triangulo(t1);
        t2.verDim();
        System.out.println("Area: " + t2.area());
        System.out.println("El estilo es " + t2.getEstilo());
  
    }
}
