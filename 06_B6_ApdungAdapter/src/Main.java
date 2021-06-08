import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new CollectionUtilsAdapter());
        Set<Integer> list = new HashSet<>();
        list.add(9);
        list.add(4);
        list.add(10);
        list.add(92);
        list.add(1);
        client.printMaxValue(list);
    }
}
