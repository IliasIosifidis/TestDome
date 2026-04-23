public class Reverser {
  public static String reverse(String s) {
    StringBuilder newString = new StringBuilder();
    for (int i = s.length() -1 ; i >= 0; i--) {
      newString.append(s.charAt(i));
    }
    return newString.toString();
  }

  public static void main(String[] args) {
    System.out.println(reverse("hello"));     // "olleh"
    System.out.println(reverse("a"));          // "a"
    System.out.println(reverse(""));           // ""
    System.out.println(reverse("ab"));         // "ba"
  }
}