import java.util.Arrays;
import java.util.Scanner;

public class Equals {
    //Returns true, if the two other arrays equal.

    static boolean equal(int[]data){
        Scanner sc = new Scanner(System.in);
        int[]secondArray = new int[data.length];

        for(int i=0; i< secondArray.length; i++){
            secondArray[i] = sc.nextInt();
        }

        return Arrays.equals(data, secondArray);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(equal(data));
    }
}
