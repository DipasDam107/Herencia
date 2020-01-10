/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v5) y realiza los
siguientes cambios:
• Añade un constructor más a la clase Figura2D, a este se le pasa solo un parámetro que se le asigna
tanto al alto como al ancho (figura igual alto que ancho).
• Hacer el constructor sin parámetros (ya no se crea por defecto) en este caso tanto alto como
ancho igual a cero.
• Añade a la clase Triangulo también un constructor sin parámetros, que invoque al constructor sin
parámetros de la clase base (aunque se hace por defecto) y que ponga el estilo a null.
• Añade otro constructor a la clase Triangulo, con un solo parámetro, para aquellos que tienen igual
alto que ancho (en este caso el estilo será ‘igualBaseAltura’).
• Haz un programa similar a los de ejercicios anteriores pero que use las nuevas características
incorporadas en este ejercicio. 


*/
package dam107t2e6;

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
        
        System.out.println("--------------------------------");
        Triangulo t1 = new Triangulo(altura, anchura, estilo);
        
        t1.verDim();
        System.out.println("Area: " + t1.area());
        System.out.println("El estilo es " + t1.getEstilo());
        
        System.out.println("--------------------------------");
        Triangulo t2 = new Triangulo(3);
        t2.verDim();
        System.out.println("Area: " + t2.area());
        System.out.println("El estilo es " + t2.getEstilo());
        
        System.out.println("--------------------------------");
        Triangulo t3 = new Triangulo();
        t3.verDim();
        System.out.println("Area: " + t3.area());
        System.out.println("El estilo es " + t3.getEstilo());
        
        System.out.println("--------------------------------");
        TrianColor t4 = new TrianColor(2,3, "Triangulo Color", "Rojo");
        t4.verDim();
        System.out.println("Area: " + t4.area());
        System.out.println("El estilo es " + t4.getEstilo());
        System.out.println("Color: " + t4.getColor());
    }
}
