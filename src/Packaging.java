public class Packaging {
  public static int packageCount(int items) {
    int bigPacks = items / 5;
    int smallPacks = items % 5;
    return bigPacks + smallPacks;
  }

  public static void main(String[] args) {
    System.out.println(packageCount(0));    // 0
    System.out.println(packageCount(1));    // 1
    System.out.println(packageCount(4));    // 4  (four 1-packs)
    System.out.println(packageCount(5));    // 1  (one 5-pack)
    System.out.println(packageCount(6));    // 2  (one 5-pack + one 1-pack)
    System.out.println(packageCount(10));   // 2  (two 5-packs)
    System.out.println(packageCount(13));   // 5  (two 5-packs + three 1-packs)
    System.out.println(packageCount(23));   // 7  (four 5-packs + three 1-packs)
  }
}