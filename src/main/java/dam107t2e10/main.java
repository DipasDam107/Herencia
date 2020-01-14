/*
Copia la clase _movilPrepago que te proporcionará el profesor con un nombre nuevo, por ejemplo,
movilPrepago y realiza las siguientes operaciones:
• Crea una subclase llamada movilPlus igual que la anterior pero que al efectuar llamadas no se le
aplica ningún coste por el establecimiento de llamada y tiene una nueva funcionalidad llamada
videollamada a la que se le pasa los segundos de la videollamada y reduce el saldo de forma
similar a ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos (recuerda que los
atributos de movilPrepago son privados, esto puede ser un problema a resolver).
• Crea constructor para la nueva clase, que llame al constructor de la clase padre.
• Sobrescribe el método toString () en la superclase para que muestre el número y el saldo del
móvil.
• Añade una nueva subclase de movilPrepago llamada movilTarifaPlana¸ en la que navegar no
reduce el saldo, creando su constructor correspondiente y redefiniendo navegar ().
• Haz un programa que cree una instancia de movilPrepago, otra de movilPlus y otra de
movilTarifaPlana, y realicen diversas operaciones sobre los mismos: llamar, navegar, videollamar,
etc. mostrando como se reduce su saldo con el nuevo método toString ().
 */
package dam107t2e10;

/**
 *
 * @author dam107
 */

import java.util.Scanner;
public class main {
       static cMovilPrepago Activo;
       static Scanner teclado;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
        boolean salir =false; char opcion;
        int op;
        
        cMovilPrepago mprepago = new cMovilPrepago(666666666, 1,1,1,1);
        cMovilPrepago mplus = new movilPlus(777777777, 1, 1, 1);
        cMovilPrepago mplana = new movilTarifaPlana(888888888, 1, 1, 1);
        
        do {
            System.out.println("\n\n----TIPO MOVIL-----");
            System.out.println("a)Prepago\nb)Plus\nc)Tarifa Plana\nd)Salir");
            opcion = teclado.next().charAt(0); 
           switch (opcion) {
               case 'a': Activo=mprepago;  break;
               case 'b': Activo=mplus;  break;
               case 'c': Activo=mplana;  break;
               case 'd': salir = true; break;
               default: System.out.println("Opción invalida"); 
               System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
           }
           if (opcion=='a' || opcion=='b' || opcion=='c'){
               do{
                   menu();
                   op=teclado.nextInt();
                   teclado.nextLine();
                   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                   if(op==1) llamar();
                   if(op==2) recargar();
                   if(op==3) navegar();
                   if(op==4) videollamar();
                   
               }while(op!=0 || (op<0 || op>5));
           }
           
        } while (!salir);
    } //fin main    
    static void menu() {
        System.out.println("-----------------------");
        System.out.println("MENU " + Activo.toString());
        System.out.println("-----------------------");
        System.out.println("1- Llamar");
        System.out.println("2- Recargar");
        System.out.println("3- Navegar");
        
        if(Activo instanceof movilPlus)System.out.println("4- Videollamar");
        System.out.println("0- Salir");
        System.out.println("-----------------------");
        System.out.println("Dime Opcion: ");
    }
    static void llamar(){
        System.out.println("Cuantos segundos quieres llamar: ");
        Activo.efectuarLlamada(teclado.nextInt());
        teclado.nextLine();
    }
    
    static void recargar(){
        System.out.println("Cuanto quieres recargar: ");
        Activo.recargar(teclado.nextInt());
        teclado.nextLine();
    }
    
    static void navegar() {
        int cantidad;
        System.out.println("Cuanto quieres navegar: ");
        cantidad= teclado.nextInt();
        teclado.nextLine();
        if(Activo instanceof movilTarifaPlana) ((movilTarifaPlana) Activo).navegar(cantidad);
        else Activo.navegar(cantidad);
    }
    
    static void videollamar(){
        if(Activo instanceof movilPlus){ 
            System.out.println("Cuantos segundos: ");
            ((movilPlus) Activo).videollamada(teclado.nextInt());
        }
        }
    }
    
        