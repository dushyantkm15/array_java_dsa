import java.util.Scanner;

public class dd2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of your array");
        int n = sc.nextInt();

        int a[] = new int[n];


        int i, sum = 0;
        int arr[] = new int[n];

        System.out.println("Enter  numbers");

        Scanner s = new Scanner(System.in);

        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j;
        for (j = 0; j < arr.length; j++) {
            if (arr[j] % 3 == 0 && arr[j] % 5 == 0) ;
            sum = sum + arr[j];


        }



        System.out.println(sum);
    }
}

