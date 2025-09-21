package solutions;

public class Sqrtx {

    public int mySqrt(int x) {

        int num = 0;

        while (true) {
            if ((long) num * num <= x) {  // cast to long
                num++;
            } else {
                num--;
                break;
            }
        }

        return num;



        /*
        double number = 4;
        double guess = number / 2;  // start with 2
        double tolerance = 0.0001;

        int step = 1;
        while (Math.abs(guess * guess - number) > tolerance) {
            System.out.println("Step " + step + ": " + guess);
            guess = (guess + number / guess) / 2;
            step++;
        }

        return (int) guess;

         */


    }

    public static void main(String[] arg) {


        Sqrtx t = new Sqrtx();

        System.out.println(t.mySqrt(2147395600));




    }
}
