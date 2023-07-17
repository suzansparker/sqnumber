public class SpecialSubsequence {

    public static int countAGSubsequence(String str) {

        int count = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'A') {

                for (int j = i + 1; j < length; j++) {

                    if (str.charAt(j) == 'G') {

                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String string1 = "ABCGAG";
        System.out.println(countAGSubsequence(string1));

        String string2 = "GAB";
        System.out.println(countAGSubsequence(string2));
    }
}