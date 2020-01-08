package dam107t2e1;

public class Figura2D {
    public double ancho;
    public double alto;
    
    
    Figura2D(double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
    }
    
    public void verDim(){
        System.out.printf("Alto : %.2f Ancho : %.2f \n", this.alto, this.ancho);
    }
}
