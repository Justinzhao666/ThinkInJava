package chapter_3;

import java.util.Random;

/**
 * Created by justin on 2017/6/14.
 */

public class Chapter3 {

    public static  void main(String[] args){
        // 参数是设置一个随机种子，注意：同一个种子生成的随机序列总是一致的！----所以这是一种伪随机
        // 如果不设置会用当前系统的时间作为随机因子
        Random rand = new Random(47);
        // 取出随机数只需要nextInt/nextLong/nextFloat...
        System.out.println(rand.nextInt()+" "+rand.nextInt());

        // 3.14默认为double
        float var = 3.14f;

        // Java传值传地址
        ValueOrRef vor = new ValueOrRef();
        //传值
        int num =1;
        vor.tranValue(num);
        System.out.println(num); //=1
        //传引用
        A a = new A();
        a.a = 1;
        vor.tranRef(a);
        System.out.println(a.a);//=2
        //传值
        vor.tranValue(a.a);
        System.out.println(a.a);//=2
    }
}

class A{
    int a;
}

class ValueOrRef {

    public ValueOrRef(){
    }


    public void tranValue(int num){
        num = 2;
    }

    public void tranRef(A a){
        a.a = 2;
    }
}
