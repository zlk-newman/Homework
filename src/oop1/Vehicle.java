package oop1;
/**
 * 面向对象作业
 * 第2题
 * 汽车父类
 */

import java.util.Scanner;

public class Vehicle {
        //创建Vehicle的各属性对象
        static String brand;
        static String color;
        static double speed=0;

        public Vehicle() {

    }
    public Vehicle(String vehicleName, double vehicleSpeed) {
        super();
        this.brand = vehicleName;
        this.speed = vehicleSpeed;
    }
    //Getter和Setter方法
    public void setBrand(String br){
            final String b=br;
            brand=b;
        }
        public void setColor(String col){
            color=col;
        }
        public double setspeed(double sp){
            speed=sp;
            return speed;
        }

        public String getBrand() {
            return brand;
        }

        public String getColor() {
            return color;
        }

        public double getspeed() {
            return speed;
        }
        //汽车启动方法
        public void run(){
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
                                        speed=0;
                                        System.out.println("是否要再次上路（Y/N）：");
                                        String o = sc.next();
                                        if (o.equals("Y")) {
                                            run();
                                            break;
                                        } else if (o.equals("N")) {
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
        //主方法
        public static void main(String[] args) {
            //获取汽车属性
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入汽车名：");
            brand=sc.next();
            System.out.println("请输入汽车颜色：");
            color=sc.next();
            System.out.println("您汽车的资料如下：");
            System.out.println("汽车名："+brand);
            System.out.println("汽车颜色："+color);
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

