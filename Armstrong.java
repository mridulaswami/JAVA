import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int o=n;
        int temp=n;
        int sum=0,rem=0,count=0,r=0;
        while(n>0) {
            rem = n % 10;
            n = n / 10;
            count++;
        }
        while(temp>0){
            r=temp%10;
            temp=temp/10;
            sum= sum+(int)Math.pow(r,count);
        }
        return sum==o;
    }
}
