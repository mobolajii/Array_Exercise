import java.util.Scanner;

public class Replace {

    static void replace(int[]data){
        System.out.println("Give in number to replace with 0 in array: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i=0; i<data.length; i++){
            if(data[i] == number){
                data[i] = 0;
            }

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

        replace(data);
    }
}
