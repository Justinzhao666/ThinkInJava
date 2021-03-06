package chapter_8;

/**
 * Created by Justin on 2017/7/8.
 */

class Father{
    int field = 0;
    public int getField(){
        return field;
    }

    private void fun(){
        System.out.println("Father fun");
    }

    public static void staticFun(){
        System.out.println("Father static fun");
    }
    public static void main(){
        Father f = new Son();
        f.fun(); //输出的是Father fun。不会多态！
    }
}

class Son extends Father{
    private void fun(){ //子类重写父类不叫override
        System.out.println("Son fun");
    }

    public static void staticFun(){
        System.out.println("Son static fun");
    }

    int field = 1;
    int field2 = 2;
    @Override
    public int getField(){
        /**
         *
         * 所以可以想象，多态只是简单的代码的替换（把这个方法覆盖父类的），不会涉及内存的交错使用！
         * */
        return field;
//        return field2; // 可以返回Son内存中的2，所以说f不是只在Father代码中的，还是两个类相结合进行运行的。--该测试和重载多态无关
    }
    public int getFatherField(){
        return super.field;
    }
}


public class Chapter8 {
    //一般销毁函数命名
    protected void dispose(){

    }

    public static void main(String[] args){
        Father f = new Son();
        System.out.println(f.field+","+f.getField());  // return  0 , 0（很关键）--使用的成员属性还是父类的（因为成员属性不具备多态特性）
        Son s = new Son();
        System.out.println(s.field+","+s.getField()+","+s.getFatherField());  // return  1 , 1 , 0

        f.staticFun(); //输出Father static fun static方法不会被重载。
    }
}
