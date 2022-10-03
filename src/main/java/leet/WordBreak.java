package leet;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        List<Integer> dpList = new ArrayList<>();
        dpList.add(len);  //8

        Set<String> words = new HashSet<>(wordDict);

        for(int i = len - 1; i >= 0; i--) {
            for (int j = dpList.size() - 1; j >= 0; j--) {
                String sub = s.substring(i, dpList.get(j));
                if (words.contains(sub)) {
                    dpList.add(i);
                    break;
                }
            }


        }

        return dpList.get(dpList.size() - 1) == 0;
    }
}
