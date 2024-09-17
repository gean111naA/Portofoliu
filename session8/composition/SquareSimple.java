package ro.siit.session8.composition;

public class SquareSimple {
    private Rectangle seenAsRectangle = new Rectangle();

    public void setEdge(double edge){
        seenAsRectangle.setLength(edge);
        seenAsRectangle.setWidth(edge);
    }

    public double getArea(){
        return seenAsRectangle.getArea();
    }
}
