/**
 * @author flo
 * @since 17/10/2017.
 */
public class ReadFromKey {

    public static void main(String[] args) {
        int number = SkeletonJava.readIntConsole("Un numar?");
        if(number < 0) {
            SkeletonJava.printConsole("Negativ");
        } else {
            SkeletonJava.printConsole(number * number);
        }
    }
}
