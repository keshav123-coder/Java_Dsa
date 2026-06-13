public class basicmethod {

    static void printsum(int x, int y) {
        System.out.println("sum: " + (x + y));
    }

    static void printmultiplication(int a, int b) {
        int ans = a * b;
        System.out.println("RESULT: " + ans);
    }

    public static void main(String[] args) {

        printsum(5, 3);

        printmultiplication(4, 6);
    }
}