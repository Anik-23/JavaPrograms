
import java.util.Scanner;

public class Peterson {

    static void petersonNum(int num) {

        int temp = num;
        int count = 0;
        while (temp > 0) {

            count++;
            temp /= 10;

        }
        temp = num;
        int sum = 0;
        while (count > 0) {

            int digit;
            digit = temp % 10;
            sum += factorial(digit);
            count -= 1;
            temp /= 10;

        }
        if (num == sum) {

            System.out.println("Peterson");
        } else {
            System.out.println("Not peterson");
        }

    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * factorial(n - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        petersonNum(num);
    }
}
