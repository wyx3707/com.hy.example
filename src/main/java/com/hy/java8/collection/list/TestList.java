
import java.util.ArrayList;
import java.util.List;

public class TestList {
	
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("a");
        all.add("b");
        all.add("d");
        all.add("c");
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }

    }
}
