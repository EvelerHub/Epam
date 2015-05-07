package ua.nure.manko.Practice1;

/**
 * Created by Eveler on 06.05.2015.
 */
public class Part3 {

    private static int nod(int a, int b) {
        int div = a / b;
        return div == 0 ? b : nod(a % b, b);
    }

    public static void main(String[] args) {
        System.out.println(nod(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }

}
