package chapter_4;

/**
 * Created by justin on 2017/7/3.
 */
//: control/LabeledFor.java
// For loops with "labeled break" and "labeled continue."
import static common.util.Print.*;

/**
 * Java 标签用法
 * 通过使用标签，我们可以使得在内层循环中中断外层的循环！---这也是标签的主要作用
 * 不推荐使用标签！
 * */
public class  Chapter4{
    public static void main(String[] args) {
        int i = 0;
        //两层循环,标签和迭代之间不要加入任何语句
        outer: // Can't have statements here
        for(; true ;) { // infinite loop
            inner: // Can't have statements here
            for(; i < 10; i++) {
                print("i = " + i);
                if(i == 2) {
                    print("continue");
                    continue;
                }
                if(i == 3) {
                    print("break");
                    i++; // Otherwise i never
                    // gets incremented.
                    break;
                }
                if(i == 7) {
                    print("continue outer");
                    i++; // Otherwise i never gets incremented.
                    /*
                    *  带标签的continue 会跳转到标签位置，然后进入那个标签后的继续循环！
                    * */
                    continue outer;
                }
                if(i == 8) {
                    print("break outer");
                    /*
                    *  带标签的break会中断并跳出标签锁指定的循环，这里就是直接从内层循环跳出外层循环！
                    * */
                    break outer;
                }
                for(int k = 0; k < 5; k++) {
                    if(k == 3) {
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Can't break or continue to labels here
    }
}
/* Output:
i = 0
continue inner
i = 1
continue inner
i = 2
continue
i = 3
break
i = 4
continue inner
i = 5
continue inner
i = 6
continue inner
i = 7
continue outer
i = 8
break outer
*///:~