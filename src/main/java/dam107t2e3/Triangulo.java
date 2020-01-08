
package dam107t2e3;



public class Triangulo extends Figura2D{
    public String estilo;
    
    Triangulo(double alto, double ancho, String estilo){
        this.setAlto(alto);
        this.setAncho(ancho);
        this.estilo=estilo;
    }

    public String getEstilo() {
        return estilo;
    }
    
    public double area(){ 
        return (this.getAlto()*this.getAncho())/2d;
    }
    
}
