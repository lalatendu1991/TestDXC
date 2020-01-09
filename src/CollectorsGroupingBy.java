import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Jon", "Ajeet", "Steve",
                        "Ajeet", "Jon", "Ajeet");

       // names.sort(Comparator.comparing(l -> l));
        List<String> sortedList = names.stream().sorted((l1, l2) -> l1.compareTo(l2))
                .collect(Collectors.toList());
        System.out.println(sortedList);

        Map<String, Long> map =
                names.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(map);

    }
}
