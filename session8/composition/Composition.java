package ro.siit.session8.composition;

public class Composition {
    public static void main(String[] args) {
        Square fig1 = new Square();
        fig1.setLength(4);
        fig1.setWidth(40);

        System.out.println(fig1.getArea());

        SquareSimple fig2 = new SquareSimple();
        fig2.setEdge(2);
        System.out.println(fig2.getArea());
    }
}
