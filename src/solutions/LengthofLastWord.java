package solutions;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {

        String[] parts = s.split(" ");

        return parts[parts.length-1].length();

    }




    public static void main(String[] arg) {

        String s = "Hello World";
        LengthofLastWord t = new LengthofLastWord();

        System.out.println(t.lengthOfLastWord(s));


    }
}
