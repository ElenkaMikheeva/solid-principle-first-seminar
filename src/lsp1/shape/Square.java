package lsp1.shape;

public class Square implements Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + side;
    }
}
