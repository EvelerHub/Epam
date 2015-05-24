package ua.nure.manko.Practice1;

/**
 * Created by Eveler on 06.05.2015.
 */
public class Part5 {

    public static int chars2digits(String number) {
        int tenRandix = 0;

        for (int i = 0; i < number.length(); i++) {
            tenRandix = tenRandix * 26 + (number.charAt(i) - 'A'+1);
        }

        return tenRandix;
    }

    public static String digits2chars(int number) {
        String str = "";
        int num = number;
        int radix = 26;
        int mod;
        do {
            mod = num % radix;
            mod = mod == 0 ? radix : mod;
            char character = (char) (mod + 'A'-1);
            str =  str.concat(String.valueOf(character));
            num /=  radix;
        } while (num > 0);

        char mas[] = str.toCharArray();

        for (int i = 0; i < mas.length / 2; i++) {
            char tem = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tem;
        }

        return String.valueOf(mas);
    }

    public static String rightColumn(String number) {
        return digits2chars(chars2digits(number) + 1);
    }

}
