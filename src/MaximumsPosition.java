import java.util.Scanner;

public class MaximumsPosition {
    //prints the index of maximum
    static void maximumsPosition(int[]data){
        int max = data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]>max)max = data[i];
            if(max == data[i]) System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        maximumsPosition(data);
    }
}
