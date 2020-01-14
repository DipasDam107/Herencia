/*
Usando las clases del ejercicio anterior, haz un programa que cree un ArrayList de teléfonos de tipo
movilPlus. Inserta varios teléfonos y luego prueba el método remove () pasándole como parámetro un
objeto de tipo movilPlus. ¿Funciona? Modifica la clase con los cambios necesarios para que funcione
(haciendo una nueva versión).
 */
package dam107t2e11;

/**
 *
 * @author dam107
 */

import dam107t2e10.*;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
       
       static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <movilPlus> moviles = new ArrayList<>();
        moviles.add(new movilPlus(111111111, 1, 1 ,1));
        moviles.add(new movilPlus(222222222, 1, 1 ,1));
        moviles.add(new movilPlus(333333333, 1, 1 ,1));
        moviles.add(new movilPlus(444444444, 1, 1 ,1));
        moviles.add(new movilPlus(555555555, 1, 1 ,1));
        moviles.add(new movilPlus(666666666, 1, 1 ,1));
        
        System.out.println("Lista");
        System.out.println("-------------------------------");
        System.out.println(moviles);
        System.out.println("Dime numero a Borrar: ");
        long numero = teclado.nextLong();
        
        if(moviles.remove(new movilPlus(numero,0,0,0))) System.out.println("Movil Borrado");
        else System.out.println("Movil no borrado");
        
        System.out.println("-------------------------------");
        System.out.println("Lista");
        System.out.println("-------------------------------");
        System.out.println(moviles);
    }
}
    
        