import java.util.*;

public class Sort {

    static void sort (String numbers){
        StringTokenizer st = new StringTokenizer(numbers);
        ArrayList<Integer>elements = new ArrayList<Integer>();

        while(st.hasMoreTokens()){
            elements.add(Integer.parseInt(st.nextToken()));
        }


        Collections.sort(elements);


        System.out.println(elements);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        sort(numbers);

    }
}
