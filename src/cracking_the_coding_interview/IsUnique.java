package cracking_the_coding_interview;

public class IsUnique {

    /*
     * P90
     * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
     */

    public static void main(String[] args) {

        System.out.println("[solution 1] with 'duplicate' >>> expected : true, actual : " + isUnique1("duplicate"));
        System.out.println("[solution 1] with 'banana' >>>  expected : false, actual : " + isUnique1("banana"));

        System.out.println("[solution 2] with 'duplicate' >>> expected : true, actual : " + isUnique2("duplicate"));
        System.out.println("[solution 2] with 'banana' >>>  expected : false, actual : " + isUnique2("banana"));

    }

    // solution 1 with an additional data structure
    static Boolean isUnique1(String input) {
        // Return false if the string length exceeds the number of unique characters in the alphabet.
        if (input.length() > 128) return false;

        boolean[] arr = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i);
            if(arr[num]){
                return false;
            }
            arr[num] = true;
        }
        return true;
    }

    // solution 2 with no additional data structure
    static Boolean isUnique2(String input) {
        for (int i = 0; i < input.length(); i++) {
            int flag = 0;
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)){
                    flag++;
                }
            }
            if(flag > 1) {
                return false;
            }
        }
        return true;
    }

}
