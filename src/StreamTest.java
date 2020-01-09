import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String args[]){
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        List<String> collect = names.stream()
                .filter(s -> s.length() > 5)
                .limit(1)
                .map(s -> {
                    return s.toUpperCase();
                })
                .collect(Collectors.toList());

        System.out.println(collect);

        List<String> sorted = names.stream()
                .sorted((Comparator.comparing(s -> s))).collect(Collectors.toList());
        System.out.println(sorted);

        sorted.forEach(s -> System.out.println(s));
    }

}