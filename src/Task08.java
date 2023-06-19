import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int t = 1;
        if (num >= t << 16) t <<= 16;
        if (num >= t << 8) t <<= 8;
        if (num >= t << 4) t <<= 4;
        if (num >= t << 2) t <<= 2;
        if (num >= t << 1) t <<= 1;
        t = ~t;
        System.out.println(Integer.toBinaryString(num&t));
    }
}
