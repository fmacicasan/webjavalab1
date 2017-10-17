import java.util.Arrays;

/**
 * @author flo
 * @since 17/10/2017.
 */
public class MinMaxInSorted {

    public static void main(String[] args) {
        int[] sir = {7,-1,0,1,2,2,3,4,4,5};

        System.out.println(Arrays.toString(sir));
        Arrays.sort(sir);
        System.out.println(Arrays.toString(sir));

        int min = sir[0];
        int max = sir[sir.length - 1];

        System.out.println(min + " " + max);
    }
}
