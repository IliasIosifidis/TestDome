public class Palindrome {
  public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      while (left < right && !Character.isLetter(s.charAt(left))) {
        left++;
      }
      while (left < right && !Character.isLetter(s.charAt(right))){
        right--;
      }

      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));               // true
    System.out.println(isPalindrome("hello"));                  // false
    System.out.println(isPalindrome("A man a plan a canal Panama")); // true
    System.out.println(isPalindrome(""));                       // true (edge case!)
    System.out.println(isPalindrome("a"));                      // true
  }
}