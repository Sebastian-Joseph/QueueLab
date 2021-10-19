import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> booths = new LinkedList<String>();
        booths.add("1");
        booths.add("2");
        booths.add("3");
        booths.add("4");
        System.out.println(booths);

        Iterator iterator = booths.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
    }
}
