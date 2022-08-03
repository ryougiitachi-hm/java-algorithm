package per.itachi.java.algorithm.commons;

public class SwapEntry {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("Before calculation, a=%d, b=%d. %n", a, b);
        a -= b;
        b += a;
        a = b - a;
        System.out.printf("After calculation, a=%d, b=%d. %n", a, b);
    }

}
