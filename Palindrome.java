public class Palindrome {
  public static boolean isPalindrome(String str) {
    int n = str.length();
    int k = 0;
    StackObj stack = new StackObj(n);
    for (int i = n - 1; i >  n / 2; i--) {
      stack.push(str.charAt(i));
      if (str.charAt(k) != (char)stack.top()) {
        return false;
      }
      else k++;
    }
    return true;
  }

  public static void main(String[] args) {
    testPalindrome();
  }

  public static void testPalindrome() {
    String[] testStrings = {
      "racecar",      // Palindrome
      "hello",        // Not a palindrome
      "deified",      // Palindrome
      "level",        // Palindrome
      "stack",        // Not a palindrome
      "A man a plan a canal Panama"  // Palindrome (ignoring spaces and case)
    };

    for (String str : testStrings) {
      boolean result = isPalindrome(str);
      System.out.println("Is '" + str + "' a palindrome? " + result);
    }
  }
}