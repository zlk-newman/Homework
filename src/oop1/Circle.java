package oop1;
/**
 * 面向对象作业
 * 第3题
 * 圆形类
 */
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Circle extends Shape{

    private  int radius;

    public Circle(String color, int radius) {
        this.color=color;
        this.radius = radius;
    }

    @Override
    public void getArea() {
        this.area= (int) (3*power(this.radius,2));
    }

    @Override
    public void getPer() {
        this.per=2*3*this.radius;
    }

    @Override
    public void ShowAll() {
        System.out.println("本图形的半径"+this.radius);
        System.out.println("本图形的面积"+this.area);
        System.out.println("本图形的周长"+this.per);
        System.out.println("颜色"+this.color);

    }
    public static void main(String[] args) {

        Circle c=new Circle("qise",4);
        c.getPer();
        c.getArea();
        c.ShowAll();
    }
}
