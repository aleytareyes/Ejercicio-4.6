
package circle;


public class Circle {
    private int radius;
    private int diameter;
    private int area;
    public Circle(){
        this.radius = 1;
        this.diameter = 2*radius;
        this.area = (int)Math.PI*(radius*radius);
    }
    public void setRadius(int radio){
        this.radius = radius;
        this.diameter = 2*radius;
        this.area = (int)Math.PI*(radius*radius);
    }
    public float Diameter(){
        return radius * 2;
    }
    public float Area(){
        return (radius*radius)*(int)Math.PI;
    }
    public String getRadius(){
        return "Radio: " + this.radius + "Diametro: " + this.diameter + "Area: " + this.area; 
    }
}
