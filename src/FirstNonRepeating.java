import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
  public static char firstNonRepeatingChar(String s) {
    Map<Character, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
      } else {
        map.put(s.charAt(i), 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()){
      if (entry.getValue() == 1){
        return entry.getKey();
      }
    }
    return ' ';
  }

  public static void main(String[] args) {
    System.out.println(firstNonRepeatingChar("abcdcaf"));    // 'b'
    System.out.println(firstNonRepeatingChar("aabbcc"));     // ' '
    System.out.println(firstNonRepeatingChar("leetcode"));   // 'l'
    System.out.println(firstNonRepeatingChar(""));           // ' '
    System.out.println(firstNonRepeatingChar("a"));          // 'a'
    System.out.println(firstNonRepeatingChar("aa"));         // ' '
  }
}