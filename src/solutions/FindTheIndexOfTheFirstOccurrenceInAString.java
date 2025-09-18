package solutions;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {

        int hLength = haystack.length();
        int nLength = needle.length();

        if (nLength == 0) return -1;

        for (int i = 0; i <= hLength - nLength; i++) {

            int j = 0;

            while (j < nLength && needle.charAt(j) == haystack.charAt(i + j)) {

                j++;

            }
            if (j == nLength) {

                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        String haystack = "leetcode";
        String needle = "leeto";

        FindTheIndexOfTheFirstOccurrenceInAString test = new FindTheIndexOfTheFirstOccurrenceInAString();

        System.out.println(test.strStr(haystack, needle));

    }
}
