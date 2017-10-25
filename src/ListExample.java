import test1.Calc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 24/10/2017.
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Jon");
        list.add("Mary");
        list.add("1");
        list.add(new Calc().toString());

        for(Object element : list) {
            System.out.println( (Integer)element);
        }
    }
}
