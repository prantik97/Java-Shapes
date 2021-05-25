package com.company;
//import java.util.Scanner;
class Rectangle{
    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
    public double reArea(){
        return length*breath;
    }
}

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* 3.14* radius*radius + 2*3.14*radius*height;
    }
    public double Area(){
        return 2*3.14*radius*radius*height;
    }
}
public class CylinderMain {
    public static void main(String[] args) {
        Cylinder Cy = new Cylinder(12,22);
        //int n = Scanner.
       // Cy.setRadius(12);
       // Cy.setHeight(22);
        System.out.println(Cy.surfaceArea());
        System.out.println(Cy.Area());
        Rectangle Re = new Rectangle(10,12);
        System.out.println(Re.reArea());
    }
}