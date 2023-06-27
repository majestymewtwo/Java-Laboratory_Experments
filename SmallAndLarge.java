import java.util.Scanner;
//1D
public class SmallAndLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            System.out.print("Enter value " + i + " ");
            int val = sc.nextInt();
            maximum = Math.max(val, maximum);
            minimum = Math.min(val, minimum);
        }
        System.out.println("The smallest value is " + minimum);
        System.out.println("The largest value is " + maximum);
        sc.close();
    }
}
