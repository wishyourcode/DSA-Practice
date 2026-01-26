
/*
Create a Class Shape having a field shapeType and a function printMyType.
Create another class, Square and Rectangle, which inherits the Shape class
 and has additional fields length and breadth. Both Square and Rectangle 
 classes will have two functions calculateArea, which will return the object's area, 
 and printMyType, which will print the type of the object.
Inside the main, first create the object of class Square and have a length equal to 5 and
 call the printMyType then calculateArea method after creating the object of class Rectangle 
 having the length equal to 5 and breadth equal to 4 and again call the printMyType 
 and calculateArea method. */
class Shape {
    String shapeType;

    public void printMyType() {
        System.out.println(shapeType);
    }
}

class Square extends Shape {
    int length;

    public Square(int length) {
        this.length = length;
        this.shapeType = "Square";
    }

    public int calculateArea() {
        return length * length;
    }

    @Override
    public void printMyType() {
        System.out.println("Square");
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.shapeType = "Rectangle";
    }

    public int calculateArea() {
        return length * breadth;
    }

    @Override
    public void printMyType() {
        System.out.println("Rectangle");
    }
}

public class OverRidingMethod {

    public static void main(String args[]) {

        Square square = new Square(5);
        square.printMyType();
        System.out.println(square.calculateArea());

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.printMyType();
        System.out.println(rectangle.calculateArea());
    }
}
