import java.util.Scanner;

class Often{

    //counts how often index is the same as data[index]
    static int often(int[]data){
        int count = 0;

        for(int i=0; i< data.length; i++){
            if(data[i] == i)count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<limit; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(often(data));
    }
}