package AtCoderBegineerContest083;

import java.util.Scanner;

public class Main083A {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int l = Integer.valueOf(sc.next()) + Integer.valueOf(sc.next());
        final int r = Integer.valueOf(sc.next()) + Integer.valueOf(sc.next());
        System.out.println(whichLean(l, r));
        sc.close();
    }

    public static String whichLean(final int l, final int r) {
        if (l < r) {
            return "Right";
        } else if (l > r) {
            return "Left";
        } else {
            return "Balanced";
        }
    }
}