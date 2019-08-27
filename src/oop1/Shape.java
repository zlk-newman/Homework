package oop1;
/**
 * 面向对象作业
 * 第3题
 * 被图形调用的抽象类
 */
public abstract class Shape {
    //设置抽象类图形属性
    protected int area;
    protected int per;
    protected  String color;

    //设置抽象类方法
    public abstract void getArea();
    public abstract void getPer();
    public abstract void ShowAll();

    public Shape(){}
    public Shape(int area, int per, String color) {
        this.area = area;
        this.per = per;
        this.color = color;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
