import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachVsForEachOrdered {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("d1", "d2", "d3", "d4", "khadd"));
System.out.println(list);
        list.stream()
                .filter(f->f.startsWith("d"))
                //.parallel()
                .forEach(n->System.out.println(n));

        System.out.println("parallelStream");
        list.parallelStream()
                .filter(f->f.startsWith("d"))
                .forEach(n->System.out.println(n));

        System.out.println("Print using forEachOrdered");
        list.stream()
                .filter(f->f.startsWith("d"))
                .parallel()
                .forEachOrdered(n->System.out.println(n));
    }

}
