/**
 * @author flo
 * @since 17/10/2017.
 */
public class CalculatorPentruCopilasi {

    public static void main(String[] args) {

        int a = SkeletonJava.readIntConsole("Primul numar?");
        int b = SkeletonJava.readIntGUI("Al doilea numar?");

        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = max;

        while (min > 0) {
            sum += 1;
            min = min - 1;
        }

        SkeletonJava.printGUI(sum);

    }
}
