import java.util.Scanner;

public class Delete {

    //deletes element in an array

    static void delete(int[]data){
        System.out.println("Give in number to delete: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=0; i<data.length; i++){
            if(data[i] == number){
               i = i+1;
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

        delete(data);
    }
}
