package oop1;
/**
 * 面向对象作业
 * 第5题
 * 园丁类
 */

import java.util.Scanner;
public class Gardener {
    public void creater(){
        while(true) {
            String s = "";
            Scanner in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("苹果")) {
                new Apple();
                continue;
            } else if (s.equals("梨")) {
                new Pear();
                continue;
            } else if (s.equals("橘子")) {
                new Oranges();
                continue;
            } else {
                System.out.println("没这个东西，再见(<_<)!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Gardener().creater();
    }
}