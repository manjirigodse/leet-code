package leet;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        final Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                map.put(t.charAt(i), -1);
            }
        }

        if(map.values().stream().anyMatch(integer -> integer != 0)){
            return false;
        }
        return true;
    }
}