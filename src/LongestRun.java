public class LongestRun {
  public static char longestConsecutiveChar(String s) {
    if (s.isEmpty()) return ' ';

    char currentChar = s.charAt(0);
    int currentRun = 1;
    char bestChar = s.charAt(0);
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
        bestChar = c;
      }
    }
    return bestChar;
  }

  public static void main(String[] args) {
    System.out.println(longestConsecutiveChar("aabbbccccd"));  // 'c' (run of 4)
    System.out.println(longestConsecutiveChar("abcde"));        // 'a' (all runs of 1, first wins)
    System.out.println(longestConsecutiveChar("aabb"));         // 'a' (tie, 'a' is first)
    System.out.println(longestConsecutiveChar("a"));            // 'a'
    System.out.println(longestConsecutiveChar(""));             // ' '  (empty case)
    System.out.println(longestConsecutiveChar("aaa"));          // 'a'
  }
}