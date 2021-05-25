package com.company;
abstract class Shape
{
    private double length;
    private double width;

    public void setValues(double length, double width)
    {
        this.length = length;
        this.width = width;
    }


    public double getLength()
    {
        return length;
    }


    public double getWidth()
    {
        return width;
    }


    public abstract double getArea();
    public void show(){
        System.out.println("Length: "+length);
        System.out.println("Width"+width);
    }
}


class Rectangle extends Shape
{
    public double getArea()
    {
        return getLength() * getWidth();
    }
}

class Triangle extends Shape
{
    public double getArea()
    {
        return (getLength() * getWidth()) / 2;
    }
}



public class Main {

    public static void main(String[] args) {


        Rectangle rect = new Rectangle();



        rect.setValues(34.7,76.9);
        rect.show();


        System.out.println("Area of rectangle : " + rect.getArea());

        Triangle tri = new Triangle();


        tri.setValues(34,3);
        tri.show();

        System.out.println("Area of triangle : " + tri.getArea());
    }
}
