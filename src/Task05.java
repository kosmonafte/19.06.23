import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int num, one = 1;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int input = scanner.nextInt();
        one = one << input;
        one = ~one;
        System.out.println(Integer.toBinaryString(num&one));
    }
}
