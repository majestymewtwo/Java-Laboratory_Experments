import java.util.Scanner;
//1B
public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int limit = sc.nextInt();
        System.out.println("The sequence is");
        for(int i=1; i<=limit; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
