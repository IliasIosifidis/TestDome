public class MegaStore {
  public enum DiscountType {
    Standard,
    Seasonal,
    Weight;
  }

  public static double getDiscountedPrice(double cartWeight,
                                          double totalPrice,
                                          DiscountType discountType) {
    return switch (discountType){
      case Standard -> totalPrice * 0.94;
      case Weight -> cartWeight > 10 ? totalPrice * 0.82 : totalPrice * 0.94;
      case Seasonal -> totalPrice * 0.88;
    };
  }

  public static void main(String[] args) {
    System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
  }
}
