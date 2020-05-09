package AtCoderBegineerContest081;

import java.util.Scanner;

public class Main081A { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc = sc.next();
        char ONE = '1';
        int cnt = 0;
        for (char s : abc.toCharArray()) {
            if(ONE == s) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }

    /* 数える対象の文字以外を置換する */
    public void anotherResolver(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("0", "");
        System.out.println(s.length());
        sc.close();
    }
}