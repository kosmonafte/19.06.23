import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int bit = scanner.nextInt();
        num = num >> 32 - bit << 32 - bit;
        System.out.println(Integer.toBinaryString(num));
    }
}