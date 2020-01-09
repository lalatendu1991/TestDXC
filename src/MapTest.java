import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String args[]) {

        Map<String, String> hm = new HashMap<>();

        hm.put("aaa", "jjj");
        hm.put("abc", "zzz");
        hm.put("bca", "lkj");
        hm.put("www", "ooo");
        hm.put("ccc", "ddd");
        hm.put("qqq", "eee");

        System.out.println("hm:" + hm);

        LinkedHashMap<String, String> lhmByValue = hm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("lhmByValue:" + lhmByValue);

        Map<String, String> map = hm.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldval, newval) -> oldval, LinkedHashMap::new));

        System.out.println("map:" + map);


    }
}
