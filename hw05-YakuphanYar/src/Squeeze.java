import java.util.Scanner;

public class Squeeze {

    public static void main(String args[]) {
        //We ask the user for words.
        Scanner string = new Scanner(System.in);
        System.out.println("Enter your word:");
        String string1 = string.nextLine();
        System.out.println("Enter your second word:");
        String string2 = string.nextLine();

        //We define the lengths of the words into an int variable.
        int word1 = string1.length();
        int word2 = string2.length();
        //We run the variables inside the method.
        System.out.println(squeezeChars(string1, word1, string2, word2));
        }

    public static String squeezeChars(String s1, int word1, String s2, int word2)
    {
        String s3 = "";
        //We define an empty string variable for the same ones.
        int[] arr = new int[26];
        //We define arrays for words.
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < word2;
             i++)
            arr[s2.charAt(i) - 'a'] = -1;
        for (int i = 0; i < word1; i++) {
            if (arr[s1.charAt(i) - 'a'] != -1) {
                s3 += s1.charAt(i);
            }
        }
        s1 = s3;
        return s1;
    }
    }
