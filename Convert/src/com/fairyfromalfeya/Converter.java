package com.fairyfromalfeya;

public class Converter {

    public static String convert(String val, int from, int to) {
        return convertFromDecimalSystem(convertToDecimalSystem(val, from), to);
    }

    public static String convertToDecimalSystem(String val, int from) {
        char[] str = val.toCharArray();
        int[] nums = new int[str.length];

        for (int i = 0; i < str.length; i++)
            nums[i] = charToNum(str[i]);

        long decimal = 0;

        for (int i = 0; i < nums.length; i++)
            decimal += nums[nums.length - i - 1] * Math.pow(from, i);

        return String.valueOf(decimal);
    }

    public static String convertFromDecimalSystem(String dec, int to) {
        long decimal = Long.parseLong(dec);
        StringBuilder result = new StringBuilder();

        while (decimal != 0) {
            result.append(numToChar(decimal % to));
            decimal /= to;
        }

        return result.reverse().toString();
    }

    public static int charToNum(char letter) {
        if (letter > 47 && letter < 58)
            return letter - 48;
        else if (letter > 96 && letter < 123)
            return letter - 87;
        else if (letter > 64 && letter < 91)
            return letter - 55;
        else
            return letter;
    }

    public static char numToChar(long num) {
        if (num > -1 && num < 36)
            if (num < 10)
                return (char)(num + 48);
            else
                return (char)(num + 87);
        else
            return (char)num;
    }
}
