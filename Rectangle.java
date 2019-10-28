public class Rectangle{
    private double length;
    private double width;

    public Rectangle(){
        length = 1.0;
        width = 2.0;
    }
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public double getWidth(){
        return width;
    }
    public double getLegth(){
        return length;
    }

    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
    
    public double getArea(){
        return width * length;
    }
}
