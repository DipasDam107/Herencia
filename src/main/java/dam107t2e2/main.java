/*
Realiza las siguientes operaciones:
• Crea una clase llamada Figura2D con atributos numéricos con decimales y públicos: ancho y alto
y un método verDim que muestre por consola el alto y el ancho en una sola línea, con dos
decimales.
• Define una clase llamada Triángulo que es hija de Figura2D y añádele una cadena llamada estilo
(vale: isósceles, rectángulo, equilátero, etc.), un método llamado área que devuelva la superficie
del triángulo y un último método llamado verEstilo que muestre por consola el valor del atributo
estilo.
• Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos y use los
métodos para ver sus dimensiones, estilo y área. 

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
