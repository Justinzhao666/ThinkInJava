package chapter_5;
import static common.util.Print.jout;

/**
 * Static在Java中的特性
 *
 * Created by justin on 2017/6/17.
 */

class A{
    public A(String str){
        jout("Created A: "+str);
    }
}
public class StaticDemo {

    public StaticDemo(){

    }

    public void fun1(){

    }

    private static A a1 = new A("static out");
    A a2 = new A("not static out");

    public static void main(String[] args){
        StaticDemo s = new StaticDemo();
        A a3 = new A("not static not out");

//        static A a4 = new A("static not out ");  静态的不能作用域局部变量！
    }

}
/*
* output:
* Created A: static out : 类加载阶段，最先。加载完成执行main函数。
* Created A: not static out：static只加载一次
* Created A: not static not out
* */