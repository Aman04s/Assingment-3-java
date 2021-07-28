import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) throws Exception {

        Scanner keyboardInput = new Scanner(System.in);

        double A;
        double B;
        double C;

        System.out.println("wat is the value of A");
        A = keyboardInput.nextDouble();
        System.out.println("wat is the value of B");
        B = keyboardInput.nextDouble();
        System.out.println("wat is the value of C");
        C = keyboardInput.nextDouble();

        double x = ((-B + ((B*B)-(4*A*B)))/ (2*A));
        System.out.println(x);
    }
}
