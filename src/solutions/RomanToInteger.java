package solutions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<String, Integer> roman = new HashMap<>();

        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int num = 0;

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == 'I') {

                if ((i + 1) == c.length) {

                    num += 1;

                } else {

                    if (c[i + 1] == 'V' || c[i + 1] == 'X') {

                        num -= 1;

                    } else {

                        num += 1;
                    }

                }

            } else if (c[i] == 'V') {

                num += 5;

            } else if (c[i] == 'X') {

                if ((i + 1) == c.length) {

                    num += 10;

                } else {

                    if (c[i + 1] == 'L' || c[i + 1] == 'C') {

                        num -= 10;

                    } else {

                        num += 10;
                    }

                }

            } else if (c[i] == 'L') {

                num += 50;

            } else if (c[i] == 'C') {

                if ((i + 1) == c.length) {

                    num += 100;

                } else {

                    if (c[i + 1] == 'D' || c[i + 1] == 'M') {

                        num -= 100;

                    } else {

                        num += 100;
                    }

                }

            } else if (c[i] == 'D') {

                num += 500;

            } else if (c[i] == 'M') {

                num += 1000;

            }

        }

        return num;

    }

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();

        String num = "MCMXCIV";

        System.out.println(romanToInteger.romanToInt(num));

    }
}
