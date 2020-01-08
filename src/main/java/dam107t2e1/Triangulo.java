/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e1;

/**
 *
 * @author dam107
 */
public class Triangulo extends Figura2D{
    public String estilo;
    
    Triangulo(double alto, double ancho, String estilo){
        super(ancho, alto);
        this.estilo=estilo;
    }

    public String getEstilo() {
        return estilo;
    }
    
    public double area(){ 
        return (this.alto*this.ancho)/2d;
    }
    
}
