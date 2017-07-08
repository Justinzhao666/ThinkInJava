package chapter_8;//: polymorphism/CovariantReturn.java

class Grain {
  public String toString() { return "Grain"; }
}

class Wheat extends Grain {
  public String toString() { return "Wheat"; }
}

class Mill {
  Grain process() { return new Grain(); }  //返回了一个Grain
}

class WheatMill extends Mill {
  Wheat process() { return new Wheat(); }  //返回了Grain的子类对象
//  String process(){return  new String("123")}  : 只能返回父类中方法返回对象的子类对象！
}

public class CovariantReturn {
  public static void main(String[] args) {
    Mill m = new Mill();
    Grain g = m.process();
    System.out.println(g);
    m = new WheatMill();
    g = m.process();
    System.out.println(g);
  }
} /* Output:
Grain
Wheat
*///:~
