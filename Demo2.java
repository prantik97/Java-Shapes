abstract  class Shape2{
    public double length;
    public double width;
    abstract double area();
    public void show(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
    }
}
class Rectangle2 extends Shape2{
    Rectangle2(double l,double w){
        this.length=l;
        this.width=w;
    }
    public double area(){
        return length*width;
    }

}
class Triangle2 extends Shape2{
    Triangle2( double h,double g){
        this.length=h;
        this.width=g;
    }
    public double area(){
        return (length*width)/2;
    }
}
public class Demo2 {
    public static void main(String[] args) {

        Rectangle2 rect= new Rectangle2(12.5,3.7);
        rect.show();
        System.out.println(rect.area());
        Triangle2 tri =new Triangle2(34,3);
        tri.show();
        System.out.println(tri.area());

    }
}
