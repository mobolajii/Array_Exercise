import java.util.Scanner;

public class Split {

    static void split(int[]data){
        int[]dataA = new int[data.length/2];


        for(int i=0; i<data.length/2; i++){
            dataA[i] = data[i];
            System.out.println(dataA[i]);

        }
        System.out.println(" ");
        for(int i=data.length/2; i< data.length; i++){
            System.out.println(data[i]);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];


        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();

        }

        split(data);

    }
}
