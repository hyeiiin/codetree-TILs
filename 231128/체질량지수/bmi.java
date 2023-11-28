import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int bmi = w * 100 * 100 / (h * h);
        System.out.printf("%d\n", bmi);
        if (bmi >= 25) System.out.println("Obesity");
    }
}