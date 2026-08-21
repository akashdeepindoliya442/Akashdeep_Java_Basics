import java.util.Scanner;
public class Day_12_In_Java {
    public static void main(String[] args) {
        System.out.println("Check The Factorial Of Any Number!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number Of Which You Want To Get The Factorial:");
        int Fact=sc.nextInt();
        for(int i=Fact-1;i>=1;i--){
            Fact=Fact*i;
        }
        System.out.println(Fact);
        sc.close();
    }
}
