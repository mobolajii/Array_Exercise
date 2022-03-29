import java.util.Scanner;


class SecondMaximum {

    static int secondMaximum(int[]data){
        int secondMax = data[0];
        int max = data[0];
        for (int i=0; i<data.length; i++){
            if(data[i]>max)max = data[i];
        }

        for (int i=0; i<data.length; i++){
            if( data[i]<max && data[i]>secondMax ){
                secondMax = data[i];
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(secondMaximum(data));
    }
}

