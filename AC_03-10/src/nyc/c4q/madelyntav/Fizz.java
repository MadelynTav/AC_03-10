package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez on 3/10/15.
 */
import java.util.Scanner;

public class Fizz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<101; i++) {
            if ((i % 3==0 && i % 5==0))
                System.out.println("Fizz Buzz");
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }



            else
            System.out.println(i);
        }


    }
}







