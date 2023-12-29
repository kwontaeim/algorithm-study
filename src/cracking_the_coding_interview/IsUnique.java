package cracking_the_coding_interview;

public class IsUnique {

    /*
     * P90
     * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
     */

    public static void main(String[] args) {

        System.out.println("[Input 1] duplicate >>> expected : true, actual : " + isUnique("duplicate"));
        System.out.println("[Input 2] banana >>>  expected : false, actual : " + isUnique("banana"));

    }

    static Boolean isUnique(String input) {
        int[] arr = new int[256];
        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i);
            arr[num] = arr[num] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 1)
                return false;
        }
        return true;
    }

}
