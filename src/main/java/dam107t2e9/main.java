/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e9;

import java.util.Scanner;

/**
 *
 * @author dam107
 */
public class main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
        int opcion;
        
        System.out.println("Dime IBAN: ");
        CuentaPlazo c1 = new CuentaPlazo(teclado.nextLine());
        
        do{
            menu(c1.IBAN);
            opcion=teclado.nextInt();
            teclado.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if(opcion==1) ingresar(c1);
            if(opcion==2) retirar(c1);
            if(opcion==3) System.out.println("El saldo es " + c1.getSaldo());
        }while(opcion!=0 || (opcion<0 || opcion>3));
    }
    
    public static void menu(String iban){
        System.out.println("-----------------------");
        System.out.println("MENU CUENTA " + iban);
        System.out.println("-----------------------");
        System.out.println("1 - Ingresar");
        System.out.println("2 - Retirar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("0 - Salir");
        System.out.println("-----------------------");
        System.out.println("Dime Opcion: ");
    }
    
    public static void ingresar(CuentaPlazo c1){
        System.out.println("Cantidad a ingresar: ");
        c1.ingresar(teclado.nextFloat());
        System.out.println("Ingreso exitoso. Saldo:  " + c1.getSaldo());
    }
    
    public static void retirar(CuentaPlazo c1){
        System.out.println("Cantidad a ingresar: ");
        if (c1.retirar(teclado.nextFloat())) System.out.println("Retirada exitosa. Saldo: " + c1.getSaldo());
        else System.out.println("No hay tanto saldo");
    }
}
