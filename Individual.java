import java.util.Scanner;
//1A
public class Individual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        System.out.println("The sum of digits is " + sum);
        sc.close();
    }
}