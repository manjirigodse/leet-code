package leet;

import java.lang.reflect.Array;
import java.util.*;

public class ContainsDuplicateII219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Set<Integer> tempSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                tempSet = map.get(nums[i]);
                Iterator<Integer> itr = tempSet.iterator();
                while(itr.hasNext()){
                    if(i - itr.next() <= k) return true;
                }

                tempSet.add(i);
                map.put(nums[i], tempSet);
                tempSet = new HashSet<>();

            } else {
                tempSet.add(i);
                map.put(nums[i], tempSet);
                tempSet = new HashSet<>();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }


}
