import java.util.Scanner;

public class Task7 {
    static void text (String Name) {
        System.out.println("Привет, " + Name);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String v1 = in.nextLine();
        text(v1);
    }
}
