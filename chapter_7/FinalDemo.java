package chapter_7;

/**
 * final代表不可以变！
 * Created by Justin on 2017/7/6.
 */

class Father{
    final int i;
    public Father(){
        i = 1; //i必须被初始化，不会因为是成员变量而设为标准初值。----final是特殊的。
        /**
         * final修改变量不可以被修改，且必须初始化一次。
         * */
//        i = 2;
    }

    final void function(){
        System.out.println("Father's function");
    }
    private void function2(){System.out.print("Father's private function");}
}

final class Son extends Father{
/**
 * final函数不可以被覆盖,直接代码检查就不可以！
 * */
//    void function(){
//        System.out.println("");
//    }
/**
 * private 相当于是隐式的final，可以在子类写一个一样的函数，但是这个不叫做覆盖override！
 * private是隐藏在Father类中的，覆盖是指基类的接口被重写会导致多态这一特性，不是指重写一个方法这个行为。
 * 可以写final private，但是没有任何区别，final就是让函数在继承的时候隐匿在类内。
 * */
    void function2(){
        System.out.print("");
    }
}

/**
 * final修饰的类不可以被继承
 * */
//class GrandSon extends Son{
//
//}



public class FinalDemo {

    public static void main(String[] args){

    }
}
