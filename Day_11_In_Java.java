import java.util.Scanner;
public class Day_11_In_Java {
    public static void main(String[] args) {
        System.out.println("Printing The Sum Of Selected Numbers!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Initial Value:");
        int a=sc.nextInt();
        System.out.print("Enter The Final Value:");
        int b=sc.nextInt();
        int Sum=0;
        for(int i=a;i<=b;i++){
            Sum=Sum+i;
        }
        System.out.println("Sum From "+a+" To "+b+" Is:"+Sum);
        sc.close();
    }
}