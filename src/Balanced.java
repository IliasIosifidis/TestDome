import java.util.ArrayDeque;
import java.util.Deque;

public class Balanced {
  public static boolean isBalanced(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else if (c == ')' || c == ']' || c == '}') {
        if (stack.isEmpty()) return false;
        char opener = stack.pop();
        if (!matches(opener, c)) return false;
      }
    }
    return stack.isEmpty();
  }

  private static boolean matches(char opener, char closer){
    return (opener == '(' && closer == ')')
        || (opener == '[' && closer == ']')
        || (opener == '{' && closer == '}');
  }

  public static void main(String[] args) {
    System.out.println(isBalanced("()"));                // true
    System.out.println(isBalanced("()[]{}"));            // true
    System.out.println(isBalanced("([{}])"));            // true
    System.out.println(isBalanced("([)]"));              // false  ← tricky!
    System.out.println(isBalanced("("));                 // false
    System.out.println(isBalanced(""));                  // true
    System.out.println(isBalanced("]"));                 // false
    System.out.println(isBalanced("{[()]}"));            // true
    System.out.println(isBalanced("a(b[c]d)e"));         // true
  }
}
