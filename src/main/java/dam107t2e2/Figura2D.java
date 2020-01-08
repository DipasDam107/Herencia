package dam107t2e2;

import dam107t2e1.*;

public class Figura2D {
    private double ancho;
    private double alto;

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    
    Figura2D(double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
    }
    
    public void verDim(){
        System.out.printf("Alto : %.2f Ancho : %.2f \n", this.alto, this.ancho);
    }
}
