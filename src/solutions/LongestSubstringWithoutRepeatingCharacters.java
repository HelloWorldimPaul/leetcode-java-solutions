package solutions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;


        /*
        var sb = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);


            while (sb.indexOf(String.valueOf(c1)) != -1) {
                sb.deleteCharAt(0);
            }

            sb.append(c1);
            maxLength = Math.max(maxLength, sb.length());

        }

        return maxLength;

         */

    }

    public static void main(String[] arg) {

        String s = "abcabcbb";

        var t = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println(t.lengthOfLongestSubstring(s));

    }

}
