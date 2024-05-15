import java.util.HashMap;
import java.util.Map;
public class CountingDuplicate {
    
    public static int duplicateCount(String text){
        Map<Character, Integer> charCountMap = new HashMap<>();
        String lowerCaseText = text.toLowerCase();
        for (char c : lowerCaseText.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0) + 1);
        }
        
        int duplicateCount = 0;
        for (int count : charCountMap.values()){
            if (count > 1){
                duplicateCount++;
            }
        }
        return duplicateCount;
    }
    
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("aabBcde"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCount("aA11"));
        System.out.println(duplicateCount("ABBA"));
    }
}