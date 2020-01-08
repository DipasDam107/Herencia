
package dam107t2e1;

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
