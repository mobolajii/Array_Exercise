import java.util.Scanner;


class SecondMaximum {

    //returns the second largest number in the array
    static int secondmax(int[]data){

        int max = data[0];
        int secondMax = data[0];

        for(int i=0; i<data.length; i++){
            if(data[i]>max) {
                secondMax = max;
                max = data[i];
            }else if(data[i]>secondMax)secondMax = data[i];

        }

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(secondmax(data));
    }
}

