package solutions;


public class AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            System.out.println( sum);

            System.out.println("sum divided by 2 remainder: " + sum % 2);

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();



        /*

        int num1 = 0;
        int num2 = 0;

        int power = 0;

        for (int i = a.length() - 1; i >= 0; i--) {

            System.out.println("a to the pow " + (int) Math.pow(2, power));

            num1 += Character.getNumericValue(a.charAt(i)) * ((int) Math.pow(2, power));
            power++;

        }

        power = 0;

        for (int j = b.length() - 1; j >= 0; j--) {

            System.out.println( "b power: " + b);

            System.out.println("b to the pow " + (int) Math.pow(2, power));
            num2 += Character.getNumericValue(b.charAt(j)) * ((int) Math.pow(2, power));
            power++;
        }

        System.out.println("num1: " + num1 + " num2: " + num2);
        int sum = num1 + num2;



        StringBuilder sb = new StringBuilder();

        while (true) {

            sb.append(sum % 2);

            if (sum / 2 == 0) {
                break;

            }

            sum = sum / 2;

        }

        return sb.reverse().toString();


         */

    }


    public static void main(String[] arg) {

        AddBinary t = new AddBinary();

        String a = "10";
        String b = "111";


        System.out.println(t.addBinary(a, b));

    }

}
