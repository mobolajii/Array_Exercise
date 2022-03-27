import java.util.Scanner;

public class CountNumbers {
    //Count how many times a number appears in an array.

    static int countNumbers(int[]data){
        System.out.println("Give in a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        for(int i=0; i<data.length; i++){
            if(data[i] ==number )count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(countNumbers(data));
    }
}
