package common.util;


/**
 * Created by justin on 2017/6/25.
 */
public class Demo {

    public static void main(String[] args){

        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    throw new RuntimeException();
                }catch (Exception ex){
//                    ex.printStackTrace();
                    System.out.print("nihao");
                }


            }
        };

        t.start();
    }
}
