package ss12_map_and_tree.exercise;

import java.util.*;

public class CountWordFrequency {
    public static void main(String[] args) {
        String str = "Dave found joy in the daily routine of life " +
                "He awoke at the same time " +
                "ate the same breakfast and drove the same commute " +
                "He worked at a job that never seemed to change and he got home at 6 pm sharp every night " +
                "It was who he had been for the last ten years and he had no idea that was all about to change";
        str = str.toLowerCase();
        String[] wordArr = str.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < wordArr.length; i++) {
            if (!map.containsKey(wordArr[i])) {
                map.put(wordArr[i], 1);
            } else {
                map.put(wordArr[i], map.get(wordArr[i]) + 1);
            }
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println("'" + key + "'" + " xuất hiện " + map.get(key) + " lần");
        }
    }
}
