import java.util.Scanner;

public class array1 {
    private static int i;

    public static void main(String[] args){
/*
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        for(int i = 0; i <= n-1; i++){
            System.out.println("provide input for index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("your array contains:");

        for(int value : arr){
            System.out.println(value);
        }


          int arr[] ={10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        int n = arr.length;

        for(int i=0; i<=n-1; i++){
            int value = arr[i];
            sum =sum + value;
        }
        System.out.println(sum);


        int arr[] = {2,3,4,5};
        int ans =1;
        int n =arr.length;

        for(int i=0;i<n-1; i++){
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println(ans);

*/
        int arr[] = {3,4,-5,34,67};

        int n = arr.length;
        int minvalue = arr[0];

        for(int i = 0; i < n; i++) {
            if(arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }

        System.out.println(minvalue);

    }
}