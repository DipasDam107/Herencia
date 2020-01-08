/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e1;

import java.util.Scanner;

/**
 *
 * @author dam107
 */
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
