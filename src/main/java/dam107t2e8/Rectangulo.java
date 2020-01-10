/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e8;

/**
 *
 * @author dam107
 */
public class Rectangulo extends Figura2D {
    Rectangulo(double lados, String nombre){
        this.setAlto(lados);
        this.setAncho(lados);
        this.setNombre(nombre);
    }
    Rectangulo(double alto, double ancho, String nombre){
        this.setAlto(alto);
        this.setAncho(ancho);
        this.setNombre(nombre);
    }
    
    public boolean esCuadrado(){
        if(this.getAlto()==this.getAncho()) return true;
        else return false;
    }
}
