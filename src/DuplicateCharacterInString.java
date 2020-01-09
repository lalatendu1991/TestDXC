import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterInString {

    public static void main(String args[]){
        String str ="aaavwvzvveeddfkhfwhwz";
        Map<Character,Integer> m= new HashMap<>();
        char [] ar=str.toCharArray();
        /*for(int i=0;i<ar.length;i++){
            if(m.containsKey(ar[i])){
                m.put(ar[i], m.get(ar[i])+1);
            }else{
                m.put(ar[i], 1);
            }
        }*/
        for(Character c: ar){
            if(m.containsKey(c)){
                m.put(c, m.get(c)+1);
            }else{
                m.put(c, 1);
            }
        }
        System.out.println(m);

        Map<Character, Integer> sortedMap = m.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(sortedMap);


    }
}
