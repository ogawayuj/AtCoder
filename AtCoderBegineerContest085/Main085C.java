package AtCoderBegineerContest085;

import java.util.Scanner;

public class Main085C {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int paramN = sc.nextInt();
        final int paramY = sc.nextInt();
        System.out.println(judgeOtoshidama(paramN, paramY));
        sc.close();
    }

    public static String judgeOtoshidama(final int N, final int Y) {
        for (int cnt10 = 0; cnt10 <= N; cnt10++) {
            for (int cnt5 = 0; cnt5 <= N - cnt10; cnt5++) {
                final int cnt1 = N - (cnt10 + cnt5);
                if (Y == (cnt10 * 10000 + cnt5 * 5000 + cnt1 * 1000)) {
                    return cnt10 + " " + cnt5 + " " + cnt1;
                }
            }
        }
        return "-1 -1 -1";
    }
}