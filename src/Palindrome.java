import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    //Returns true if array consists of a palindromic number.
    static boolean palindrome(int[]data){
        int[]reverse = new int[data.length];

        for(int i=0; i<data.length; i++){
            reverse[i] = data[data.length-1-i];
        }

        return Arrays.equals(data, reverse);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(palindrome(data));
    }
}

