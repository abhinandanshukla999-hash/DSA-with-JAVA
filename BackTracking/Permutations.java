package BackTracking;

public class Permutations {
    public static void main(String args[]) {

        String str = "abc";
        permutations(str, "");

    }

    public static void permutations(String str, String ans) {

        // base case

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // work flow

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // removing that element from the temp String

            String temp = str.substring(0, i) + str.substring(i + 1);

            permutations(temp, ans + curr);

        }
    }

}