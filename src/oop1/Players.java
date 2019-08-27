package oop1;
/**
 * 面向对象作业
 * 第1题
 * 球员类
 */

import java.util.Scanner;

public class Players {
    //定义两个静态对象：a 创建对象的反馈,sum对象个数。
    private static String a;
    private static int sum;
    //球员构造方法
    public static void player(){
        a="创建了一个对象";
        System.out.println(a);
    }
    //创建响应个数球员的方法
    public void create(int s){
        int m=11;
        if (s<=11){
        for(int i=0;i<s;i++)
            player();
        }else{
            for(int i=0;i<11;i++){
                player();
            }
            System.out.println("对不起，已经创建了11个对象，不能在创建对象了");
        }
    }
    //主函数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要创建的球员个数：" );
        sum=sc.nextInt();
        Players p=new Players();
        p.create(sum);
    }
}
