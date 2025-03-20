package Baek;
import java.util.Scanner;

public class Baek1546 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double A[] = new double[n]; // 시험 본 과목 수가 많아서

        double max = 0;
        double sum = 0;
        for (int i=0; i<n; i++){
            A[i] = sc.nextDouble();
            sum += A[i];
            if (max < A[i]){
                max = A[i];}
        }
        System.out.println(sum *100.0/ max / n );
    }
}
