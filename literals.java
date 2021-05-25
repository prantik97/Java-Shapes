package com.company;
import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class literals {

    public static void main(String[] args) {
                MyEmployee harry = new MyEmployee();
                // harry.id = 45;
                // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
                harry.setName("CodeWithHarry");
                System.out.println(harry.getName());
                harry.setId(234);
                System.out.println(harry.getId());

                Square sq = new Square();
                sq.side=12;
                System.out.println("The area of the square is " + sq.area());
                System.out.println("The perimeter of the square is "+ sq.perimeter());
                int n;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the element you want to store in the\n"+"Array");
                n=sc.nextInt();
                        int []a = new int [n];
                System.out.println("Enter the elements of the array");
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                System.out.println("Array elements are");
                for (int elements:a
                     ) {
                    System.out.print(elements+" ");

        }


    }
}