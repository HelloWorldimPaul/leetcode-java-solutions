package solutions;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        int minLength = strs[0].length();
        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }

        for (int i = 0; i < minLength; i++) {

            char c = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {

                if (strs[j].charAt(i) != c) {

                    return strs[0].substring(0, i);
                }

            }

        }

        return strs[0].substring(0, minLength);
    }

    public static void main(String[] arg) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));

    }
}
