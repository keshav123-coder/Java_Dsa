public class Basicmaths1 {

    static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;

        int sum = sumOfDigits(num);

        System.out.println(sum);
    }
}
