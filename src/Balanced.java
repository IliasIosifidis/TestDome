import java.util.Stack;

public class Balanced {
  public static boolean isBalanced(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (current == '(' || current == '[' || current == '{') {
        stack.push(current);
      } else if (current == ')' || current == ']' || current == '}') {
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
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
