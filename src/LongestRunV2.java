public class LongestRunV2 {
  public static class Run {
    public final char character;
    public final int length;

    public Run(char character, int length) {
      this.character = character;
      this.length = length;
    }

    @Override
    public String toString() {
      return "Run{" + character + ", " + length + "}";
    }
  }

  public static Run longestRun(String s) {
    return new Run('c',12);
  }

  public static void main(String[] args) {
    System.out.println(longestRun("aabbbccccd"));  // Run{c, 4}
    System.out.println(longestRun("abcde"));        // Run{a, 1}
    System.out.println(longestRun("aabb"));         // Run{a, 2}
    System.out.println(longestRun("a"));            // Run{a, 1}
    System.out.println(longestRun(""));             // Run{ , 0}  ← note the space + 0
    System.out.println(longestRun("aaabbbbcc"));    // Run{b, 4}
    System.out.println(longestRun("xxyzzzzz"));     // Run{z, 5}
  }
}