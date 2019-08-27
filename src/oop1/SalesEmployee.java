package oop1;
/**
 * 面向对象作业
 * 第4题
 * 销售人员类
 */

public class SalesEmployee extends ColaEmployee{

    private double MonthSale;//月销售额
    private double ReyaltyRate;

    public SalesEmployee(String name, int month, int birthday, double MonthSale, double ReyaltyRate) {
        super(name, month, birthday);
        if(super.getMonth()==super.getBirthday()){
            System.out.println("员工"+name+month+"月的工资为"+(MonthSale*ReyaltyRate+100));
        }

    }



}
