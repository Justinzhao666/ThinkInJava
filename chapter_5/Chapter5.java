package chapter_5;
import static common.util.Print.*;

/**
 * Created by justin on 2017/6/17.
 */
public class Chapter5 {

    public static void main(String[] agrs){
        Week w = Week.MON;
        for(Week w1 : Week.values()){ //value保存元素数组
            jout(w1);
        }
        jout(w.ordinal());//枚举对应的整数值

        //switch-case中用法
        switch (w){
            case FRI:
                break;
            case MON:
                break;
            default:
                break;
        }
    }
}

enum Week{
    MON,TUE,THR,FOUR,FRI,SAT,SUN
}