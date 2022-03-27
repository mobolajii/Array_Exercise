import java.util.Scanner;

public class Present {

    //returns true if given number is oresent in array.

    static boolean present(int[]data){
        System.out.println("Give in a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0; i<data.length; i++){
            if(data[i] ==number )return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(present(data));
    }

}
