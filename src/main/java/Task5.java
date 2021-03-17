import java.util.Scanner;

public class Task5 {
    static void Text(byte v1){
        if (v1 >= 0){
            System.out.print("Положительное");
        } else {
            System.out.print("Отрицательное");
        }
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число");
            byte v1 = in.nextByte();
            Text(v1);


    }
}
