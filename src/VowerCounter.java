public class VowerCounter {
  public static int countVowels(String s){
    String lower = s.toLowerCase();
    int vowersNo = 0;
    for (int i =0; i < s.length(); i++){
      char c = lower.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        vowersNo++;
      }
    }
    return vowersNo;
  }

  static void main() {
    System.out.println(countVowels("Hello World"));   // 3
    System.out.println(countVowels("JAVA"));           // 2
    System.out.println(countVowels(""));               // 0
    System.out.println(countVowels("xyz"));            // 0
  }
}
