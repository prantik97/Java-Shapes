class Rectangle{
    public double length;
    public double breath;
    Rectangle(){
        System.out.println("Default Constructor");
    }
    public Rectangle(double l,double b){
        System.out.println("this is parameterised cons of Rectangle");
        this.length=l;
        this.breath=b;
    }
    public double area(){
        return this.length*this.breath;
    }
}

class Couboid extends Rectangle{
    public double height;
    Couboid(){
        System.out.println("Default Cuboid constructor");
    }
    public Couboid(double h){
        super(11.89,23.56);
        this.height=h;
        System.out.println("this is parameterised cons of Couboid");
    }
    public double Volume(){
        return this.height*this.breath*this.length;
    }
}


public class CuboidSuperMethod {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(12.7,23.87);
        System.out.println("The area of Rectangle: "+rec.area());

        Couboid cu = new Couboid(14.88);
        System.out.println("The volume of Cuboid is : "+ cu.Volume());


    }
}
