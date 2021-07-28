
import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) throws Exception {
        Scanner keyboardInput = new Scanner(System.in);

        String Degree;

        System.out.println("give me a degree to convert into seconds and minutes ");
        Degree = keyboardInput.next();
        
        //taking decimal out//
        String[] split = Degree.split("\\.");
        double decimal = Double.parseDouble("." + split[1]);

        double minutes;
        double Minutes;
        minutes = (decimal*60);
        Minutes = Math.round(minutes);

    
        int number = (int) minutes;
        double seconds = (minutes - number);

        double Seconds;

        Seconds = Math.round(seconds*60);

        System.out.println("degree: " + Degree);
        System.out.println("minutes: " + Minutes);
        System.out.println("degree: " + Seconds);

    }
}

