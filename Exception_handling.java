import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n1, n2;
            int result;

            System.out.println("enter n1");
            System.out.println("enter n2");
            n1 = sc.nextInt();

            System.out.println("enter n2");
            n2 = sc.nextInt();

            result = n1 / n2;
            System.out.println("result :" + result);

        } catch (InputMismatchException e) {
            System.out.println("enter numerical values");
        } catch (ArithmeticException ae) {

        } catch (Exception e) {
            System.out.println("invalid input");
        } finally {
            sc.close();
            System.out.println("end of code");

        }
    }
}