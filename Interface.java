//6
interface Polygon {
    void calculateArea();
}

class Rectangle implements Polygon {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area is " + length * breadth);
    }
}

class Square implements Polygon {
    int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area is " + length * length);
    }
}

public class Interface {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(10);
        rectangle.calculateArea();
        square.calculateArea();
    }
}
