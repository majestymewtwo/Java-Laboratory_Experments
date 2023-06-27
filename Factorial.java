//1E
public class Factorial {
    public static int getFactorial(int num){
        if(num == 0 || num == 1)
            return 1;
        else 
            return num * getFactorial(num-1);
    }
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No command line arguments have been passed");
            return;
        }
        for(int i=0; i<args.length; i++){
            System.out.println("Factorial of " + args[i] +" is " +  getFactorial(Integer.parseInt(args[i])));
        }
    }
}
