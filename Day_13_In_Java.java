import java.util.Scanner;
public class Day_13_In_Java {
    public static void main(String[] args) {
        System.out.println("Printing Sum Of n Numbers!");
        int Sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.print("Enter Value:");
            int a=sc.nextInt();
            Sum=Sum+a;
        }
        System.out.println("Sum Is:"+Sum);
        sc.close();
    }
}

