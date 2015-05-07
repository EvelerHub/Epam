package ua.nure.manko.Practice1;

/**
 * Created by Eveler on 06.05.2015.
 */
public class Part4 {

    public static void main(String[] args) {
        int number = Integer.valueOf(args[0]);
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println(sum);
    }

}
