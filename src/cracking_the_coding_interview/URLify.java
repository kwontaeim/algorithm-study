package cracking_the_coding_interview;

public class URLify {

    /*
     * P90
     * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters,
     * and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)

        EXAMPLE
        Input: "Mr John Smith    ", 13
        Output: "Mr%20John%20Smith"
     */

    public static void main(String[] args) {

        System.out.println("[Input 1] 'Mr John Smith     ' >>> expected : Mr%20John%20Smith, actual : " + urlify("Mr John Smith    ", 13));
        System.out.println("[Input 1] 'My Name is Taeim     ' >>> expected : My%20Name%20is%20Taeim, actual : " + urlify("My Name is Taeim      ", 16));

    }

    static String urlify(String input, int length) {

        char[] charArr = new char[input.length()];
        System.out.println("input.length() " + input.length());
        int strIdx = length - 1;


        //The ASCII code for a blank space is the decimal number 32
        for(int i = charArr.length-1; i >= 0; i--) {
            charArr[i] = input.charAt(strIdx);
            System.out.println("idx " + i + " - srt : " +strIdx + "   elemnt  -  " + charArr[i]);
            if (charArr[i] == 32) {
                charArr[i] = '%';
                charArr[i - 1] = '2';
                charArr[i - 2] = '0';
                i = i - 2;
            }
            strIdx--;
        }

        return String.valueOf(charArr);
    }
}
