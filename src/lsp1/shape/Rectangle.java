package lsp1.shape;

public class Rectangle implements Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int area() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + sideA + " и " + sideB;
    }
}
