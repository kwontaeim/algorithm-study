package cracking_the_coding_interview;

public class CheckPermutation {

    /*
     * P90
     * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
     */

    public static void main(String[] args) {

        // example : app, apple
        System.out.println("[Input 1] app, ppa >>> expected : true, actual : " + checkPermutation("app", "ppa"));
        System.out.println("[Input 2] ban, tae >>>  expected : false, actual : " + checkPermutation("banana", "taeim"));

    }

    static Boolean checkPermutation(String input1, String input2) {
        if(input1.length() != input2.length()) {
            return false;
        }

        // Assume the character set was ASCII
        int[] letters = new int[128];

        char[] charArray1 = input1.toCharArray();

        for(char c : charArray1) {
            letters[c] = letters[c]++;
        }

        for(int i = 0; i < input2.length(); i++) {
            int index = input2.charAt(i);
            letters[index] = letters[index]--;
            if(letters[index] < 0) {
                return false;
            }
        }
        return true;
    }

}
