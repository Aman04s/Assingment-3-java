
import java.util.Scanner;

public class generator {
    public static void main(String[] args) throws Exception {

    Scanner keyboardInput = new Scanner(System.in);

    int N;

    System.out.println("generate a number from 1 to ");
    N = keyboardInput.nextInt();



    int random = (int)( N* Math.random() ) + 1;
        System.out.println("your number generated is " +random);
    }
}
