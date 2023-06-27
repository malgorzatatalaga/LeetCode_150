import java.util.*;


public class RomanToInteger {
    public static int romanToInt(String s) {
        String[] roman = s.split("");
        List<Integer> arabicList = new ArrayList<>();
        int result = 0;

        for (String romanChar : roman) {
            int arabicNumber = switch (romanChar) {
                case "I" -> 1;
                case "V" -> 5;
                case "X" -> 10;
                case "L" -> 50;
                case "C" -> 100;
                case "D" -> 500;
                case "M" -> 1000;
                default -> 0;
            };

            arabicList.add(arabicNumber);
        }

        System.out.println(arabicList);

        if (arabicList.size() == 1) {
            return arabicList.get(0);
        }

        for (int i = 1; i < (arabicList.size()); i++) {
            if (arabicList.get(i) <= arabicList.get((i - 1))) {
                result += arabicList.get(i - 1);
            } else {
                result -= arabicList.get(i - 1);
            }
            if ((i + 1) == arabicList.size()) {
                result += arabicList.get(i);
            }
        }

        System.out.println(result);
        return result;
    }
}
