package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
        ShapeView rectangleView = new ShapeView(rectangle);
        rectangleView.showArea();
        ShapeView squareView = new ShapeView(square);
        squareView.showArea();
    }
}
