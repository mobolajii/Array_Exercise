import java.util.Scanner;

public class Numbers {

    static void positive(int[]data){
        for(int i=0; i<data.length; i++){
            if(data[i]>0){
                System.out.println("Positive numbers " + data[i]);
            }
        }

    }


    static void negative(int[]data){
        for(int i=0; i<data.length; i++){
            if(data[i]<0){
                System.out.println("Negative numbers " +data[i]);
            }
        }
    }

    static void oddNumbers(int[]data){
        for(int i=0; i<data.length; i++){
            if(data[i]%2!=0){
                System.out.println("Odd numbers " +data[i]);
            }
        }
    }

    static void evenNumbers(int[]data){
        for(int i=0; i<data.length; i++){
            if(data[i]%2==0){
                System.out.println("Even numbers " +data[i]);
            }
        }
    }

    static void zero(int[]data){
        for(int i=0; i<data.length; i++){
            if(data[i] == 0){
                System.out.println("Number of zeri " +data[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        positive(data);
        negative(data);
        oddNumbers(data);
        evenNumbers(data);
        zero(data);

    }
}
