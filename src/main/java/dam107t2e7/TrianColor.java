
package dam107t2e7;




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
