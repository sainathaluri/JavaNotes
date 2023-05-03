package Abstraction;

abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    //abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius,2);
    }

    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}
