import java.util.Scanner;

public class Sum {

    //sum up everything in the array
    static int sum(int[]data){
        int sum = 0;
        for(int i=0; i<data.length; i++){
            sum = sum + data[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(sum(data));

    }
}
