import java.util.Scanner;

public class MaximumsPosition {
    //prints the index of maximum
    static int maximumsPosition(int[]data){
        int max = data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]>max)max = data[i];

        }

        int pos = 0;
        for(int i=0; i<data.length; i++){
            if(max == data[i]) pos = i;

        }

        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(maximumsPosition(data));
    }
}