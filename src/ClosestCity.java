public class ClosestCity {

  public static class City {
    public final String name;
    public final double x;
    public final double y;

    public City(String name, double x, double y) {
      this.name = name;
      this.x = x;
      this.y = y;
    }
  }

  public static String findClosest(City[] cities, double x, double y) {
    return " ";
  }

  public static void main(String[] args) {
    City[] cities = {
            new City("Athens",     0.0,  0.0),
            new City("Thessaloniki", 0.0, 5.0),
            new City("Patras",    -3.0, -1.0),
            new City("Heraklion",  2.0, -4.0)
    };

    System.out.println(findClosest(cities, 0.5, 0.5));    // Athens
    System.out.println(findClosest(cities, 0.0, 4.0));    // Thessaloniki
    System.out.println(findClosest(cities, -3.0, 0.0));   // Patras
    System.out.println(findClosest(cities, 2.0, -3.0));   // Heraklion
    System.out.println(findClosest(cities, 100.0, 100.0)); // Thessaloniki (closest of the four to far away)
    System.out.println(findClosest(new City[0], 0, 0));   // null (empty input)
  }
}