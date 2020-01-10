/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v8) y realiza los
siguientes cambios:
• Añadir a la clase Figura2D_v8 un atributo privado llamado nombre de tipo String.
• Añadir el getter/setter de ese campo y modificar los constructores de dicha clase para incorporar
como parámetro el nombre de la figura (en el constructor por defecto se le asignará valor null).
• Modificar la clase hija y nieta para incluir el nombre en constructores.
• Crear una nueva clase hija de Figuras2D_v8 llamada Rectangulo_v8 con constructor con tres
parámetros (alto, ancho, nombre), constructor con un dos parámetros (alto igual a ancho y
nombre) y un método que devuelve boolean llamado esCuadrado().
• Hacer un programa que cree un ArrayList con 4 rectángulos, algunos cuadrados y otros no, y
cuente cuantos hay cuadrados

*/
package dam107t2e8;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
        int cont=0;
        ArrayList <Rectangulo> rect = new ArrayList<>();
        
        rect.add(new Rectangulo(2,"Rectangulo 1"));
        rect.add(new Rectangulo(2, 3,"Rectangulo 2"));
        rect.add(new Rectangulo(2, 4,"Rectangulo 3"));
        rect.add(new Rectangulo(5,"Rectangulo 4"));
        
        for (int i = 0; i < rect.size(); i++) {
            if(rect.get(i).esCuadrado()) cont++;
        }
        
        System.out.println("Hay " + cont+ " cuadrados");
  
    }
}
