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

        do {
            int mod = number % 26;

            mod = mod == 0 ? 26 : mod;

            str += String.valueOf((char) (mod + 64));
            number = number / 26;
        } while (number > 1);

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

    public static void main(String[] args) {
        System.out.println("1 ==> " + digits2chars(1));
        System.out.println(rightColumn("Z"));

        System.out.println("26 ==> " + digits2chars(26));
        System.out.println(rightColumn("ZZ"));

        System.out.println("27 ==> " + digits2chars(27));

        System.out.println("28 ==> " + digits2chars(28));

        System.out.println("AAA =>" + chars2digits("AAA"));
        System.out.println("ZZ =>" + chars2digits("ZZ"));
        System.out.println("AB =>" + chars2digits("AB"));
        System.out.println("Z =>" + chars2digits("Z"));
    }

}
