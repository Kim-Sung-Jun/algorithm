package beakjoon;
//2021.03.13
import java.util.Scanner;

public class Q10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num < 40) {
                num = 40;
                sum = sum + num;
            } else {
                sum = sum + num;
            }
        }
        System.out.println(sum / 5);
    }
}
