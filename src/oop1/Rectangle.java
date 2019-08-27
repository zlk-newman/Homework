package oop1;
/**
 * 面向对象作业
 * 第3题
 * 矩形类
 */
public class Rectangle extends Shape {
    private int Width;
    private int Height;

    public Rectangle( String color, int width, int height) {
       this.color=color;
        this.Width = width;
        this.Height = height;
    }

    @Override
    public void getArea() {
        this.area=this.Height*this.Width;
    }

    @Override
    public void getPer() {
        this.per=2*(this.Height+this.Width);
    }

    @Override
    public void ShowAll() {
        System.out.println("本图形的宽:"+this.Height);
        System.out.println("本图形的长:"+this.Width);
        System.out.println("本图形的面积:"+this.area);
        System.out.println("颜色:"+this.color);
    }
    public static void main(String[] args) {
        Rectangle r=new Rectangle("huase",3,5);
        r.getArea();
        r.getPer();
        r.ShowAll();
    }
}
