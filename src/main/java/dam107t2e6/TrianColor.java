/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e6;

/**
 *
 * @author dam107
 */
public class TrianColor extends Triangulo{
    private String color;
    
    TrianColor(double ancho, double alto, String estilo, String color){
        super(alto, ancho, estilo);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
