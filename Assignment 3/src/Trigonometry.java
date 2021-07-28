import java.security.Key;
import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) throws Exception {

        Scanner KeyboardInput = new Scanner(System.in);

        double degree;
        double pie = 3.1415;

        System.out.println("give a angle in degree to convert to Radian");
        degree = KeyboardInput.nextDouble();

        double radiant = (degree*(pie/180));
        System.out.println("the Radiant of this Degree is " + radiant);
    }
}
