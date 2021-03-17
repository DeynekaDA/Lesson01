import java.util.Scanner;

public class Task6 {
    static boolean b (byte v1) {
        return v1 >= 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        byte v1 = in.nextByte();
        System.out.println(b(v1));
    }
}
