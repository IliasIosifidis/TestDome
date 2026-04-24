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
    if (s.isEmpty()) return new Run(' ',0);

    char currentChar = s.charAt(0);
    int currentRun = 1;
    char bestChar = currentChar;
    int bestRun = 1;

    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == currentChar){
        currentRun++;
      } else {
        currentChar = c;
        currentRun = 1;
      }
      if (currentRun > bestRun){
        bestRun = currentRun;
        bestChar = currentChar;
      }
    }
    return new Run(bestChar, bestRun);
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