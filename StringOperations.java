//7
public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Mewtwo";
        String s2 = "Senpai";
        System.out.println("The strings are " + s1 + " and " + s2);

        System.out.println("String 1 length is " + s1.length());
        System.out.println("String 2 length is " + s2.length());

        System.out.println("Concatenation of strings is " + s1.concat(s2) + " and " + s2.concat(s1));

        System.out.println("First character of string 1 " + s1.charAt(0));
        System.out.println("First character of string 2 " + s2.charAt(0));

        System.out.println("Uppercase of string 1 " + s1.toUpperCase());
        System.out.println("Uppercase of string 2 " + s2.toUpperCase());

        System.out.println("Lowercase of string 1 " + s1.toLowerCase());
        System.out.println("Lowercase of string 2 " + s2.toLowerCase());

        System.out.println("Replacing 'e' in string 1 with 'i' " + s1.replace('e', 'i'));
        System.out.println("Replacing 'i' in string 2 with 'y' " + s2.replace('i', 'y'));

        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
