public class TwoSum {
  public static int[] findPair(int[] sortedArray, int target) {
    if (sortedArray.length < 2) return null;

    int left = 0;
    int right = sortedArray.length - 1;

    while (left < right) {
      int sum = sortedArray[left] + sortedArray[right];
      if (sum == target) {
        return new int[]{left, right};
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    print(findPair(new int[]{1, 2, 3, 4, 5}, 7));        // [2, 4]   (3 + 4)
    print(findPair(new int[]{1, 2, 3, 4, 5}, 9));        // [3, 4]   (4 + 5)
    print(findPair(new int[]{2, 7, 11, 15}, 9));         // [0, 1]   (2 + 7)
    print(findPair(new int[]{1, 2, 3, 4, 5}, 100));      // null     (no pair)
    print(findPair(new int[]{1, 2, 3, 4, 5}, 3));        // [0, 1]   (1 + 2)
    print(findPair(new int[]{}, 5));                      // null     (empty)
    print(findPair(new int[]{5}, 5));                     // null     (only one element)
    print(findPair(new int[]{-3, -1, 0, 2, 4}, 1));      // [1, 4]   (-3 + 4? no: -1 + 2)
  }

  static void print(int[] r) {
    System.out.println(r == null ? "null" : "[" + r[0] + ", " + r[1] + "]");
  }
}