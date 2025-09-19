package solutions;

import java.math.BigInteger;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // if we reach here, it means all were 9s
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }


    public static void main(String[] arg) {

        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        PlusOne t = new PlusOne();

        for(int digit : t.plusOne(digits)){

            System.out.println(digit);
        }

    }

}
