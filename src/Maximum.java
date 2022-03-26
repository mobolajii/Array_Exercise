import java.util.Scanner;

public class Maximum {

    //returns the biggest number in the array

    static int maximum(int[]data){
        int max = data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]>max)max = data[i];
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(maximum(data));
    }
}
