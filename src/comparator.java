/*import java.util.*;
public class comparator {
    public static void main(String[] args) {
        String[] str = {"mathi", "Nandagopalan", "sandhiya", "harish"};
        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
        Arrays.sort(str, comp);
        System.out.println(Arrays.toString(str));
    }


}*/
import java.util.*;

interface StringLengthComparator {
    int compare(String s1, String s2);
}

public class comparator {
    public static void main(String[] args) {
        String[] str = {"mathi", "Nandagopalan", "sandhiya", "zaraa"};

        StringLengthComparator comp = (s1, s2) -> s1.length() - s2.length();

        Arrays.sort(str, (s1, s2) -> comp.compare(s1, s2));

        System.out.println(Arrays.toString(str));
    }
}
