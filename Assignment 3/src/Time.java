

import java.util.Scanner;

public class Time {
    public static void main(String[] args) throws Exception {

        Scanner keyboardInput = new Scanner(System.in);

        double hours;
        double min;
        double seconds;

        System.out.println("provide a hour");
        hours = keyboardInput.nextInt();
        System.out.println("provide a minute");
        min = keyboardInput.nextInt();
        System.out.println("provide a second");
        seconds = keyboardInput.nextInt();

        double number = (hours + ((min/60) + (seconds*(1/3600))));
        System.out.println(number);
    }
}
