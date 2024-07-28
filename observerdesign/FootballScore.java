package observerdesign;

import java.util.Scanner;

public class FootballScore {
    public static void main(String[] args) {
        Reporter obj = new Reporter();
        Registrant obj1 = new Registrant();
        Registrant obj2 = new Registrant();
        obj.register(obj1);
        obj.register(obj2);
        Scanner sc = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score ");
        scoreLine = sc.nextLine();
        while (!scoreLine.equals("")) {
            obj.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = sc.nextLine();
        }
        sc.close();
    }
}
