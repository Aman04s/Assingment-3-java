
import java.util.Scanner;

public class round {
    public static void main(String[] args) throws Exception{
    Scanner keyboardInput = new Scanner(System.in);

        double A;
        
        System.out.println("provide a decimal number to round");
        A = keyboardInput.nextDouble();

        double roundOff = (int)Math.round(A * 100)/100;
        System.out.println(roundOff);
    }
    
}
