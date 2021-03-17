import java.util.Scanner;

public class Task4 {
    static boolean ab (byte a, byte b) {
        return a+b >= 10 && a+b <= 20;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        byte v1 = in.nextByte(), v2 = in.nextByte();
        System.out.println(ab(v1,v2));

    }
}
