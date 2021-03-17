public class Task3 {

    static float abcd (float a, float b, float c, float d) {
        return a*(b+(c/d));
    }

    public static void main(String[] args) {

        float a = 3, b = 4, c = 4, d = 2;
        System.out.print(abcd(a,b,c,d));

    }

}
