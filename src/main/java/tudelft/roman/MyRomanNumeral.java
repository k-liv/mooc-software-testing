package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class MyRomanNumeral {

    private static final Map<Character, Integer> romanToDecimalMap = new HashMap<>();

    public MyRomanNumeral() {
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);
    }

    public int convert(String romanNumber) {
        int result = 0;
        
        // check for error input
        for (int i = 0; i < romanNumber.length(); i++) {
            if (!romanToDecimalMap.containsKey(romanNumber.charAt(i))) {
                return -1;
            }
        }
        for (int i = 0; i < romanNumber.length(); i++) {
            if (i < romanNumber.length() - 1
                    && romanToDecimalMap.get(romanNumber.charAt(i)) < romanToDecimalMap.get(romanNumber.charAt(i + 1))) {
                result -= romanToDecimalMap.get(romanNumber.charAt(i));
            } else {
                result += romanToDecimalMap.get(romanNumber.charAt(i));
            }
        }
        return result;
    }
}
