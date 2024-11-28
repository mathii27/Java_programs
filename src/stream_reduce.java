import java.util.*;
public class stream_reduce {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int sum = arr.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

// Integer:: sum == (a, b) -> a + b
/* 1) sum = sum +1 = 1 (initially sum = 0);
sum = sum+2 = 1+2 = 3...goes on.
final ans = 15
 */
