import java.util.Scanner;

public class Condition {
    public void ifelseifel() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your age:");
        int age = s.nextInt();
        if (age > 18 && age < 60) {
            System.out.println("can vote");

        } else if (age < 10) {
            System.out.println("too small");
        } else {
            System.out.println("CANNOT VOTE");
        }


    }

}
