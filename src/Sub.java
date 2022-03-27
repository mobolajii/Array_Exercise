import java.util.Scanner;

public class Sub {
    static void sub(int[]data){
        for(int i=3; i< data.length; i++){
            if(i==8){
                break;
            }
            System.out.println(data[i]);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i< limit; i++){
            data[i] = sc.nextInt();
        }

        sub(data);
    }
}
