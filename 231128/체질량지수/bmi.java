import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        double bmi = w / ((double)h / 100 * (double)h / 100);
        System.out.printf("%d\n", (int)bmi);
        if (bmi >= 25) System.out.println("Obesity");
    }
}