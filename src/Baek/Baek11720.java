package Baek;

import java.util.Scanner;

public class Baek11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 100자리 숫자 까지 받을 수 있음 > int, long 안됨
        // string -> toCharArray -> 아스키코드로 변환 (48차이)
        String s = sc.next();
        char[] c = s.toCharArray();

        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i] - '0';
        }
        System.out.print(sum);
    }
}
