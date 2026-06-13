package stringbasic.java;

public class string2 {

    static void printstring(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        String str = "KESHAV PRADEEP MAHAJAN";
        printstring(str);
    }

    static int getvowelscount(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}


