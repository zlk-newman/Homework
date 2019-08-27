package Reflact;

import oop1.Apple;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test01 {

    @Test
    public void  test01(){

        String s=new String();
        Class clazz=s.getClass();

        Method[] methods= clazz.getDeclaredMethods();
        //遍历描述一个类的方法构成成分的内容（反射中使用Method抽象封装类的方法对象）
        for (Method m:methods) {
            System.out.println(m.getName());
            Parameter[] parameters=m.getParameters();
            for (Parameter parameter:parameters){
                System.out.println(parameter.getType());
            }
        }
    }

}
