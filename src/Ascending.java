import java.util.Scanner;

 class Ascending{

     static boolean ascending(int[]data){
         for(int i=0; i<data.length-1; i++) {
            if(data[i]>=data[i+1])return false;
         }
         return true;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[]data = new int[limit];

        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }

        System.out.println(ascending(data));
    }
}
