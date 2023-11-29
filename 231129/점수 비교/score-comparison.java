import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt();
        int b1 = sc.nextInt(), b2 = sc.nextInt();
        System.out.print(a1 > b1 && a2 > b2 ? 1 : 0);
    }
}