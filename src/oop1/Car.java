package oop1;
/**
 * 面向对象作业
 * 第2题
 * 汽车子类
 */
import java.util.Scanner;

public class Car extends Vehicle{
    //设置子类独有属性
    private static int loader;

    public Car(String brand, double speed, int loaders) {
        // 通过super调用父类的构造方法，初始化父类的私有属性
        super(brand, speed);
        this.loader = loaders;
    }
    public static int getLoader(int loa) {
        loader=loa;
        return loader;
    }
    //重写父类汽车运行方法
    @Override
    public void run(){
        System.out.println(loader+"名乘客已上车，请系好安全带！");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("当前车速为" + speed);
            if (speed == 0) {
                while (true) {
                    System.out.println("汽车还未起步，请设置起步速度(注：最多精确到小数点后两位！)：");
                    speed = sc.nextDouble();
                    if (speed == 0) {
                        System.out.println("起步速度不能为0！");
                        continue;
                    } else {
                        while (true) {
                            System.out.println("当前汽车在行驶。车速为：" + speed);
                            System.out.println("是否选择停下（Y/N）：");
                            String q = sc.next();
                            if (q.equals("Y")) {
                                while (true) {
                                    System.out.println("汽车已安全停止。");
                                    System.out.println("请输入下车乘客数量：");
                                    int p=sc.nextInt();
                                    loader=loader-p;
                                    System.out.println("请输入上车乘客数量：");
                                    int g=sc.nextInt();
                                    loader=loader+g;
                                    System.out.println("当前车内乘客数："+loader);
                                    speed=0;
                                    System.out.println("是否要再次上路（Y/N）：");
                                    String o = sc.next();
                                    if (o.equals("Y")) {
                                        run();
                                        break;
                                    } else if (o.equals("N")) {
                                        System.out.println(loader+"名乘客，请安全下车！");
                                        loader=0;
                                        System.out.println("感谢您的使用，再见！");
                                        break;
                                    } else {
                                        System.out.println("您的输入有误，请重新输入：");
                                        continue;
                                    }
                                }
                                break;
                            } else if (q.equals("N")) {
                                continue;
                            } else {
                                System.out.println("您的输入有误，请重新输入：");
                                continue;
                            }

                        }
                    }
                    break;
                }break;
            } else {
                System.out.println("系统故障，即将停车，注意安全！");
                speed = 0;
                continue;
            }
        }

    }

    public static void main(String[] args) {
        //获取父类汽车属性，加入子类属性
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入汽车名：");
        brand=sc.next();
        System.out.println("请输入汽车颜色：");
        color=sc.next();
        System.out.println("请输入乘客人数：");
        loader=sc.nextInt();
        System.out.println("您汽车的资料如下：");
        System.out.println("汽车名："+brand);
        System.out.println("汽车颜色："+color);
        System.out.println("乘客数："+loader);
        //汽车启动
        while (true) {
            System.out.println("是否要启动汽车（Y/N）：");
            Vehicle v = new Vehicle();
            String m = sc.next();
            if (m.equals("Y") ) {
                v.run();
                break;
            } else if (m.equals("N") ) {
                System.out.println("感谢您的使用，再见！");
                break;
            } else {
                System.out.println("您的输入有误，请重新输入：");
                continue;
            }
        }
    }
}
