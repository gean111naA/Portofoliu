package ro.siit.session8.composition;

public class Rectangle {
    private double length;
    private double width;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.length * this.width;
    }
}
