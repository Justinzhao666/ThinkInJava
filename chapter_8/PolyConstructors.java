package chapter_8;//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.

import static common.util.Print.print;

class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw(); // ! 这里在子类构造中会调用子类的重载方法！ 一定要在构造函数中避免使用非final或者private方法
    print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);
  }
}	

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0 ： 因为先构造的父类，这时候radius还没有被执行，所以这里是标准初值0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
