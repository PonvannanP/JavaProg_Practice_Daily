package ex_21_Abstraction;

public class Abstract_Interfaces {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.getArea(10,10);

        square s1=new square();
        s1.getArea(12,12);
    }

}

interface Polygon
{
void getArea(int length,int breadth);// Incomplete method
}

class square implements Polygon // square class is implementing Polygon
{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of the Square "+(length*breadth));
    }
}

class Rectangle implements Polygon // Rectangle class is implementing Polygon
{
    @Override
    public void getArea(int length, int breadth) { // Complete method and Implementation tp
        // be done
        System.out.println("Area of the Rectangle is " + (length*breadth));
    }
}
