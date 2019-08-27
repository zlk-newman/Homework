package oop1;
/**
 * 面向对象作业
 * 第4题
 * 测试类
 */

public class TestCompany {
    //主函数
    public static void main(String[] args) {
        ColaEmployee[]y=new ColaEmployee[6];
        y[0]=new SalariedEmployee("Tom", 12, 2, 2000);
        y[1]=new HourlyEmployee("Jim", 6, 4, 120, 13);
        y[2]=new SalariedEmployee("Json", 5, 6, 2000);
        y[3]=new SalariedEmployee("Alex", 3, 3, 2000);
        y[4]=new SalesEmployee("Po", 1, 7, 20000, 0.13);
        y[5]=new SalesEmployee("Sun",8, 8, 20000, 0.13);

    }
}
