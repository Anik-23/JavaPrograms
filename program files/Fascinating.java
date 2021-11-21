
import java.util.Scanner;
//import java.util.Arrays;
import java.io.*;

public class Fascinating {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
//            int X = Integer.parseInt(bf.readLine());
            int[] A = new int[N];
            int countEven = 0;
            int countOdd = 0;
            int temp = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {

                if (A[i] % 2 == 0) {

                    countEven += 1;
                } else {
                    countOdd += 1;
                }
            }
            if (countEven == N || countOdd == N) {

                System.out.println("-1");
            } else {
                for (int i = 0; i < N; i++) {
                    for (int j = 1; j < N; j += 2) {
                        if (A[j] % 2 != 0) {
                            temp = A[j];
                            A[j] = A[i];
                            A[i] = temp;
                        }
                    }
                }
            }
            for (int i : A) {
                System.out.println(i);
            }

        }
    }
}
