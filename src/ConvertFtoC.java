/**
 * @author flo
 * @since 17/10/2017.
 */
public class ConvertFtoC {

    public static void main(String[] args) {

        for(int i= 0; i<=100;i++) {
            double celsius = (5.0 / 9) * (i - 32);

            System.out.println(i + "F=" + celsius + "C");
        }

    }
}
