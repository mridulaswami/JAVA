import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        isPrime(n);

    }
    static void isPrime(int n){
        if(n==0 || n==1){
            System.out.println("True");
        }
        int m =n/2,flag=0;
        for(int i=2;i<=m;i++){
            if(n%i==0) {
                System.out.println("False");
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("True");
        }
    }
}
