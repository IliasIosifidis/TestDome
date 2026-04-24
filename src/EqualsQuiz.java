public class EqualsQuiz {
  public static void main(String[] args) {
    // Group A — Strings
    String a1 = "hello";
    String a2 = "hello";
    String a3 = new String("hello");
    System.out.println(a1 == a2);              // (1) ?
    System.out.println(a1 == a3);              // (2) ?
    System.out.println(a1.equals(a3));         // (3) ?

    // Group B — Integer autoboxing, small values
    Integer b1 = 100;
    Integer b2 = 100;
    System.out.println(b1 == b2);              // (4) ?
    System.out.println(b1.equals(b2));         // (5) ?

    // Group C — Integer autoboxing, large values
    Integer c1 = 200;
    Integer c2 = 200;
    System.out.println(c1 == c2);              // (6) ?
    System.out.println(c1.equals(c2));         // (7) ?

    // Group D — mixed int and Integer
    int d1 = 200;
    Integer d2 = 200;
    System.out.println(d1 == d2);              // (8) ?

    // Group E — null safety
    String e1 = null;
    String e2 = "hello";
    // System.out.println(e1.equals(e2));      // (9) what happens?
    System.out.println(e2.equals(e1));         // (10) ?
    System.out.println(java.util.Objects.equals(e1, e2));  // (11) ?
  }
}