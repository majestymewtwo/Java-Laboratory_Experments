import java.util.Scanner;
//1C
public class Prime {
    public static boolean isPrime(int num) {
        if(num==2)
            return true;
        if(num==0 || num==1 || num%2==0)
            return false;
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
