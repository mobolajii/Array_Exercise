import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void reverseArray(int[]data){
        int[]newData = new int[data.length];
        for(int i=0; i< newData.length; i++){
            newData[i] = data[data.length-1-i];
            System.out.println (newData[i] + " ");

        }





    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }
        reverseArray(data);

    }
}
