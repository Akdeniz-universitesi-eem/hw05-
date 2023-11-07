import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args)
    {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = string.nextLine();
        //we want words from user.

        String x = "";
        //along word length:
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) //If it is a large character, we convert it to lowercase
                x += Character.toLowerCase(ch);
            else
                x += Character.toUpperCase(ch); //If it is a small character, we convert it to uppercase.
        }
        System.out.println(x);
    }
}
