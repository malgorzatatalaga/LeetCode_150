import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String solution = strs[0];
        StringBuilder sb = new StringBuilder();

        if (strs.length == 1) {
            return strs[0];
        }

        if (Arrays.asList(strs).contains("")) {
            return "";
        }

        if (solution.charAt(0) != strs[1].charAt(0)) {
            return "";
        }

        for (int i = 1; i < strs.length; i++) {
            if (solution.length() > strs[i].length()) {
                int a = 0;
                if (a < strs[i].length()) {
                    do {
                        if (solution.charAt(a) == strs[i].charAt(a)) {
                            sb.append(strs[i].charAt(a));
                        } else {
                            break;
                        }
                        a++;
                    } while (a < strs[i].length());
                }
            }

            if (solution.length() < strs[i].length()) {
                int a = 0;
                if (a < solution.length()) {
                    do {
                        if (solution.charAt(a) == strs[i].charAt(a)) {
                            sb.append(strs[i].charAt(a));
                        } else {
                            break;
                        }
                        a++;
                    } while (a < solution.length());
                }
            }
            solution = sb.toString();
            sb.delete(0, sb.length());
        }
        return solution;
    }
}
