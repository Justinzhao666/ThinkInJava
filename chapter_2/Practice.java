package chapter_2;

/**
 * Created by justin on 2017/6/1.
 */
public class Practice {
    public static void main(String[] agrs){
        //:test1
        Test1 test1 = new Test1();
        System.out.println(test1.n+"----"+test1.c);
        //:test2

    }
}

/**
 * java的类成员属性默认初始化，但是局部变量不会初始化！
 * int 初始化为0
 * char 初始化为ASCII码的0
 */
class Test1{
    int n;
    char c;
}
