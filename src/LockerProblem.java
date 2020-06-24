import java.util.Arrays;
import java.util.Scanner;

public class LockerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        boolean lockerOpen = true;

        boolean [] lockers = new boolean[100];

        for (int i = 0; i < 100; i++){
            lockers[i] = true; //initialize all lockers to be open
        }
        System.out.println(Arrays.toString(lockers)); // initialize all lockers to be open
        System.out.println(lockers.length);


        for (int i = 2; i < lockers.length; i++) {      //dividend
            for (int j = i; j < lockers.length; j++){   //iterating through lockers finding multiples of i
                if (j % i == 0){
                    if (lockers[j] = true){
                        lockers[j] = false;
                    } else if (lockers[j] = false){
                        lockers[j] = true;
                    }
                }
            }//j loop
        }//i loop
        System.out.println(Arrays.toString(lockers)); // print end result
        System.out.println(lockers.length);

        System.out.println("Locker numbers that are still open ");
        for (int i = 0; i < lockers.length; i++){
            if (lockers[i]){
                System.out.print(i+1 + " ");
            }
        }





    }
}
