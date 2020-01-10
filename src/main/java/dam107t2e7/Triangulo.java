
package dam107t2e7;




public class Triangulo extends Figura2D{
    public String estilo;
    Triangulo(){
        estilo=null;
    }
    
    Triangulo(double valor){
        super(valor);
        this.estilo="IgualBaseAltura";
    }
    
    Triangulo(double alto, double ancho, String estilo){
        super(ancho, alto);
        this.estilo=estilo;
    }

    Triangulo(Triangulo tri){
        super(new Figura2D(tri.getAlto(),tri.getAncho()));
        this.estilo=tri.getEstilo();
    }
    public String getEstilo() {
        return estilo;
    }
    
    public double area(){ 
        return (this.getAlto()*this.getAncho())/2d;
    }
    
}
