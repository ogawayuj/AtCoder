package AtCoderBegineerContest087;

import java.util.Scanner;

public class Main087B {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int maxA = Integer.valueOf(sc.nextLine());
        final int maxB = Integer.valueOf(sc.nextLine());
        final int maxC = Integer.valueOf(sc.nextLine());
        final int x = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (int numA = 0; numA <= maxA; numA++) {
            for (int numB = 0; numB <= maxB; numB++) {
                final int numC = (x - 500 * numA - 100 * numB) / 50;
                if(maxC >= numC && numC >= 0){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}